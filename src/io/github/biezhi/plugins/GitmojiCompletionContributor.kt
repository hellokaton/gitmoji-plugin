package io.github.biezhi.plugins

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PsiPlainText
import com.intellij.util.ProcessingContext

/**
 * GitmojiCompletionContributor
 *
 * @author biezhi
 * @date 2017/12/30
 */
class GitmojiCompletionContributor : CompletionContributor() {

    val mapping = EmojiMapping()

    init {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(PsiPlainText::class.java), object : CompletionProvider<CompletionParameters>() {
            override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
                if (parameters.editor.isOneLineMode) {
                    return
                }

                /**
                 * 瞎改
                 *
                 * 參考 https://github.com/JetBrains/intellij-community/blob/master/plugins/xpath/xpath-lang/src/org/intellij/lang/xpath/completion/XPathInsertHandler.java
                 */
                val editor = parameters.editor
                val charsSequence = editor.document.charsSequence
                val caretModel = editor.caretModel
                var offset = caretModel.offset

                var message = charsSequence.toString().toLowerCase()

                if (message.length < 2) {
                    return
                }

                val eb = message.indexOf(":") != -1
                var pos: Int = if (message.length > offset) offset else 0

                var msg2 = message.substring(pos).trim()

                message = message.trim()

                if (message.indexOf("\n") != -1) {
                    val split = message.split("\n")
                    message = split[split.size - 1]
                }

                if (message.indexOf(" ") != -1) {
                    val split = message.split(" ")
                    message = split[0]
                }

                if (msg2.indexOf("\n") != -1) {
                    val split = msg2.split("\n")
                    msg2 = split[split.size - 1]
                }

                if (msg2.indexOf(" ") != -1) {
                    val split = msg2.split(" ")
                    msg2 = split[split.size - 1]
                }

                if (eb) {
                    message = message.replace(":", "")
                    msg2 = msg2.replace(":", "")
                }

                mapping.actions
                        //.filterIndexed { _, it -> it.toLowerCase().indexOf(message.toLowerCase()) != -1 }
                        .forEach {

                            val ej = mapping.getText(it) as String
                            val icon = mapping.getIcon(it)

                            if (eb && (ej.toLowerCase().indexOf(message) != -1 || ej.toLowerCase().indexOf(msg2) != -1)) {
                                result.addElement(LookupElementBuilder.create(":${ej}:").withIcon(icon))
                            }

                            if (it.toLowerCase().indexOf(message) != -1 || it.toLowerCase().indexOf(msg2) != -1) {
                                result.addElement(LookupElementBuilder.create(":${ej}: " + it).withIcon(icon))
                            }
                        }
            }
        })
    }
}

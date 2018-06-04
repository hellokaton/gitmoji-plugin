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
        extend(
                CompletionType.BASIC,
                PlatformPatterns.psiElement(PsiPlainText::class.java),
                object : CompletionProvider<CompletionParameters>() {
                    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
                        if (parameters.editor.isOneLineMode) {
                            return
                        }
                        var message = parameters.editor.document.charsSequence.toString()
                        if (message.length < 2) {
                            return
                        }

                        if (message.indexOf("\n") != -1) {
                            val split = message.split("\n")
                            message = split[split.size - 1]
                        }

                        if (":all".equals(message)) {
                            mapping.actions!!.forEach {
                                result.addElement(LookupElementBuilder.create(":${mapping.getText(it)}: " + it).withIcon(mapping.getIcon(it)))
                            }
                            return
                        }

                        println("filter...")

                        mapping.actions!!.filterIndexed { _, it -> it.toLowerCase().indexOf(message.toLowerCase()) != -1 }
                                .forEach {
                                    result.addElement(LookupElementBuilder.create(":${mapping.getText(it)}: " + it).withIcon(mapping.getIcon(it)))
                                }
                    }
                }
        )
    }
}
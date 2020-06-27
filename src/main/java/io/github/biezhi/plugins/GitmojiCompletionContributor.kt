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
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    result: CompletionResultSet
                ) {
                    val editor = parameters.editor
                    if (editor.isOneLineMode) {
                        return
                    }

                    var message = editor.document.charsSequence.toString().toLowerCase()
                    if (message.length < 2) {
                        return
                    }

                    val caretModel = editor.caretModel
                    val offset = caretModel.offset
                    val pos = 0.coerceAtLeast(message.lastIndexOf(" ", offset))

                    message = message.substring(pos).trim()

                    val split = message.split(Regex("\\s"))
                    message = split[0]

                    val results = mapping.actions
                        .filter { it.toLowerCase().contains(message) }
                        .map { LookupElementBuilder.create("${mapping.getText(it)} " + it) }
                    result.addAllElements(results)
                }
            })
    }
}

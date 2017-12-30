package io.github.biezhi.plugins

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.IconLoader
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PsiPlainText
import com.intellij.util.ProcessingContext
import io.github.biezhi.plugins.model.EmojiData
import io.github.biezhi.plugins.model.EmojiMapping
import io.github.biezhi.plugins.model.Lang
import java.io.File
import java.util.*

/**
 * GitmojiCompletionContributor
 *
 * @author biezhi
 * @date 2017/12/30
 */
class GitmojiCompletionContributor : CompletionContributor() {

    val mapping = mutableListOf<EmojiMapping>()

    init {

        File(javaClass.getResource("/icons").toURI()).list()
                .filterNot { it.contains("@2") }
                .forEach {
                    val icon = IconLoader.getIcon("/icons/$it")
                    val emojiData = EmojiData(it.replaceAfter(".", "").replace(".", ""), icon)
                    val emojiMapping = EmojiMapping(Lang.us_EN, emojiData)
                    if (emojiMapping.action.isNotEmpty()) {
                        mapping.add(emojiMapping)
                        mapping.add(EmojiMapping(Lang.zh_CN, emojiData))
                    }
                }

        extend(CompletionType.BASIC, PlatformPatterns.psiElement(PsiPlainText::class.java), object : CompletionProvider<CompletionParameters>() {
            override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
                if (parameters.editor.isOneLineMode) {
                    return
                }
                val message = parameters.editor.document.charsSequence.toString()
                if (message.length < 2) {
                    return
                }

                mapping.filterIndexed { _, emojiMapping -> emojiMapping.action.toLowerCase().indexOf(message.toLowerCase()) != -1 }
                        .forEach {
                            result.addElement(LookupElementBuilder.create(":${it.emoji?.emojiText}: " + it.action).withIcon(it.emoji?.icon))
                        }
            }
        })
    }
}
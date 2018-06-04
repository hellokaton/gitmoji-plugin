package io.github.biezhi.plugins

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

/**
 * Emoji Data
 *
 * @author biezhi
 * @date 2017/12/30
 */
class EmojiData {

    val emojiText: String?
    var icon: Icon

    constructor(emojiText: String) {
        this.emojiText = emojiText
        try {
            this.icon = IconLoader.getIcon("/icons/$emojiText.png")
        } catch (e: Exception){
            this.icon = IconLoader.getIcon("/icons/anguished.png")
        }
    }

}
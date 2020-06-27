package io.github.biezhi.plugins

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

/**
 * Emoji mapping
 *
 * @author biezhi
 * @date 2017/12/30
 */

class EmojiMapping {

    private var map = HashMap<String, String>()
    val actions: MutableSet<String>
        get() {
            return map.keys
        }

    companion object {
        val DATA_ADDRESSES = arrayOf(
            "https://raw.githubusercontent.com/carloscuesta/gitmoji/master/src/data/gitmojis.json",
            "https://raw.githubusercontent.com/biezhi/gitmoji/master/src/data/gitmojis.json"
        )
    }

    init {
        DATA_ADDRESSES.forEach { dataAddress ->
            HttpClient.newHttpClient().sendAsync(
                HttpRequest.newBuilder().uri(URI.create(dataAddress)).build(),
                HttpResponse.BodyHandlers.ofString()
            ).thenApply { response ->
                response.body()
            }.thenAccept { body ->
                Gson().fromJson(body, Gitmojis::class.java).also { gitmojis ->
                    gitmojis.gitmojis.forEach {
                        this.map[it.description] = it.emoji
                    }
                }
            }
        }
    }

    fun getText(action: String): String? {
        return this.map[action]!!
    }
}

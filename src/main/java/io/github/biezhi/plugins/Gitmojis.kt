package io.github.biezhi.plugins

class Gitmojis(val gitmojis: List<Gitmoji>) {
    class Gitmoji(val emoji: String, val name: String, val description: String)
}
package dev.lawg.mcloggingtest

import io.papermc.paper.event.player.AsyncChatEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class Chat(plugin: Main) : Listener {
    private val plugin: Main

    init {
        this.plugin = plugin
    }

    @EventHandler
    fun onChat(event: AsyncChatEvent) {
        val message = event.originalMessage().toString()

        if (message.contains("error")) {
            plugin.logger.severe(message)
        } else if (message.contains("warning")) {
            plugin.logger.warning(message)
        } else {
            plugin.logger.info(message)
        }
    }
}
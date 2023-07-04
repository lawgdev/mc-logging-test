package dev.lawg.mcloggingtest

import net.kyori.adventure.text.Component
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        server.consoleSender.sendMessage(Component.text("starting lawg.dev test plugin"))
        server.pluginManager.registerEvents(Chat(this), this)
     }

    override fun onDisable() {
        server.consoleSender.sendMessage(Component.text("stopping lawg.dev test plugin"))
    }
}

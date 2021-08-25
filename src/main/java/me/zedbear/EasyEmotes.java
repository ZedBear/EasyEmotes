package me.zedbear;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EasyEmotes extends JavaPlugin implements Listener {

    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        event.setMessage(event.getMessage().replace("<3", ChatColor.RED + "♥"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":yes:", ChatColor.GREEN + "✔"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":no:", ChatColor.RED + "✖"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":shrug:", ChatColor.YELLOW + "¯\\_(ツ)_/¯"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":star:", ChatColor.YELLOW + "✮"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":java:", ChatColor.RED + "☕"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":arrow:", ChatColor.GOLD + "➜"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":tableflip:", ChatColor.YELLOW + " (╯°□°）╯︵ ┻━┻"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace("o/", ChatColor.LIGHT_PURPLE + "( ﾟ◡ﾟ)/"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":123:", ChatColor.YELLOW + "1" + ChatColor.RED + "2" + ChatColor.GREEN + "3"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":totem:", ChatColor.GOLD + "◎" + ChatColor.GREEN + "_" + ChatColor.GOLD + "◎" + ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":typing:", ChatColor.BLACK + "✎..."+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":maths:", ChatColor.GREEN + "√" + ChatColor.YELLOW + "(" + ChatColor.GREEN + "π+x" + ChatColor.YELLOW + ")=" + ChatColor.RED + "L"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":snail:", ChatColor.GREEN + "@'-'"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":thinking:", ChatColor.YELLOW + "(0.o?)"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":gimme:", ChatColor.GOLD + "༼つ ◕_◕ ༽つ"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":wizard:", ChatColor.LIGHT_PURPLE + "('-')⊃━☆ﾟ.*･｡ﾟ"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":pvp:", ChatColor.RED + "⚔"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":peace:", ChatColor.YELLOW + "✌"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":oof:", ChatColor.RED + "" + ChatColor.BOLD + "OOF"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":puffer:", ChatColor.YELLOW + " <('O')>"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":snow:", ChatColor.AQUA + "☃"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":dog:", ChatColor.GREEN + "(ᵔᴥᵔ)"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":sloth:", ChatColor.GRAY+ "( ⬩ ⊝ ⬩ )"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace("^_^", ChatColor.DARK_PURPLE + "^_^"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":dab:", ChatColor.DARK_PURPLE + "<o/"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":cat:", ChatColor.LIGHT_PURPLE + "＾● ⋏ ●＾ ="+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":yey:", ChatColor.GOLD + "ヽ (◕◡◕) ﾉ"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":h/:", ChatColor.LIGHT_PURPLE + "ヽ(^◇^*)/"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":dj:", ChatColor.GREEN + "ヽ(⌐■_■)ノ♬"+ ChatColor.RESET) );
        event.setMessage(event.getMessage().replace(":cute:", ChatColor.LIGHT_PURPLE + "(✿ᴖ‿ᴖ)"+ ChatColor.RESET) );

    }
}

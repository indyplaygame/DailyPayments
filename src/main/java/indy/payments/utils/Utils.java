package indy.payments.utils;

import org.bukkit.ChatColor;

public class Utils {
    public static String ColorFormat(String message){
        return ChatColor.translateAlternateColorCodes('&',message);
    }
}
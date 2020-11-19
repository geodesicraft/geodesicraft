package io.github.geodesicraft.geodesicraft;

import com.sk89q.worldedit.WorldEdit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandGeo implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        System.out.println("Geodesicraft: Worldedit " + WorldEdit.getVersion() + " has been hooked into! Yay!");
        return false;
    }

}

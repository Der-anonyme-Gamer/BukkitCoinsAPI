package [DeinPackage];
/*
Copyright:
2023
Felix Hausmann
  */
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public abstract class CoinsAPICmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(commandSender instanceof Player))return false;
        if(command.getName().equalsIgnoreCase("money")){
            showMoney();
        }else if(command.getName().equalsIgnoreCase("pay")){
            pay();
        }
        return true;
    }
protected abstract void showMoney();
    protected abstract void pay();  
    
}

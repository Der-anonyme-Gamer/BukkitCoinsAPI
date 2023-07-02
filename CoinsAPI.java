package [deinPackage];
/*
Copyright:
2023
Felix H
 */
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public abstract class CoinsAPI implements CommandExecutor {
    private Player p;
    private Long Coins;
    public CoinsAPI(Player p,Long coins){
    this.Coins=coins;
    this.p=p;
    }
    
public Long getCoins(){
        return Coins;
}
public void addCoins(Long coins){
        Coins+=coins;
}
// Return false if player can´t do operation
    public boolean removeCoins(Long coins){
        if(Coins>=coins){
            Coins-=coins;
            return true;
        }else{
            Coins=0L;
            return false;
        }
    }
    public void setCoins(Long coins){
        Coins=coins;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
      if(!(commandSender instanceof Player))return false;
       if(command.getName().equalsIgnoreCase("money")){
showMoney();
       }else if(command.getName().equalsIgnoreCase("pay")){
          pay();
       }
        return false;
    }
// Method to show player´s coins
    protected abstract void showMoney();
    // Method to make a pay action
    public abstract void pay();
}

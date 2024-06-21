package [deinPackage];
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

public  class CoinsAPI {

    private Player p;
    private Long Coins;

    public CoinsAPI(Player p, Long coins) {
        this.Coins = coins;
        this.p = p;
    }

    public Long getCoins() {
        return Coins;
    }

    public void addCoins(Long coins) {
        Coins += coins;
    }

    // Return false if player can´t do operation
    public boolean removeCoins(Long coins) {
        if (Coins >= coins) {
            Coins -= coins;
            return true;
        } else {
            return false;
        }
    }

    public void setCoins(Long coins) {
        Coins = coins;
    }


}

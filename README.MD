Um die Befehle /pay und /money zu benutzen, musst du in der onEnable deines Plugins die folgenden Zeilen einfügen:

getCommand("pay").setExecutor(new CoinsAPICmd());
getCommand("money").setExecutor(new CoinsAPICmd());

Überarbeite die Funktionen pay() und showMoney() in der BukkitCoinsAPICmd.java, um sie zu verwenden

und in der plugin.yml:

commands:
  pay:
  money:


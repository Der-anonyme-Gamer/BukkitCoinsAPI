Um die Befehle /pay und /money zu benutzen, musst du in der onEnable die folgenden Zeilen einfügen:

getCommand("pay").setExecutor(new CoinAPICmd());
getCommand("money").setExecutor(new CoinAPICmd());

und in der plugin.yml:

commands:
  pay:
  money:


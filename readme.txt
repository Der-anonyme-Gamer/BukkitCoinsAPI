Um die Befehle /pay und /money zu benutzen, musst du in der onEnable die folgenden Zeilen einfügen:

getCommand("pay").setExecutor(new CoinsAPICmd());
getCommand("money").setExecutor(new CoinsAPICmd());

und in der plugin.yml:

commands:
  pay:
  money:


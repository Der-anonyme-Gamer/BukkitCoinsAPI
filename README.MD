# CoinsAPI Plugin

CoinsAPI is a Minecraft plugin API that allows developers to manage virtual coins, making it easy to transfer and check balances in-game for players.

## Features

- Use the pay feature with `/pay`
- Check your coin balance with `/money`
- Simple setup and configuration

## Getting Started

### Prerequisites

- Minecraft server running Bukkit
- Java 8 or higher

### Configuration

To enable and configure the `/pay` and `/money` commands, follow these steps:

1. Open your main plugin class (e.g., `Main.java`).
2. In the `onEnable` method, add the following lines to register the commands:

   ```java
   @Override
   public void onEnable() {
       // Register commands
       getCommand("pay").setExecutor(new CoinsAPICmd());
       getCommand("money").setExecutor(new CoinsAPICmd());

       // Other initialization code...
   }
3. Open your pluin.yml
4. Add following lines to the file:
   ```YAML
    commands:
  pay:
    description: Pay feature 
    usage: /pay
  money:
    description: Check your coin balance
    usage: /money
   

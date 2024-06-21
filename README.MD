# CoinsAPI Plugin

CoinsAPI is a Minecraft plugin that allows players to manage virtual coins, making it easy to transfer and check balances in-game.

## Features

- Transfer coins between players with `/pay`
- Check your coin balance with `/money`
- Simple setup and configuration

## Getting Started

### Prerequisites

- Minecraft server running Spigot or Paper
- Java 8 or higher

### Installation

1. **Download** the latest version of CoinsAPI from [the releases page](https://github.com/your-repo/coinsapi/releases).
2. **Place** the downloaded `.jar` file into your server's `plugins` directory.
3. **Restart** your Minecraft server to load the plugin.

### Configuration

To enable and configure the `/pay` and `/money` commands, follow these steps:

1. Open your main plugin class (e.g., `Main.java` or `CoinsAPI.java`).
2. In the `onEnable` method, add the following lines to register the commands:

   ```java
   @Override
   public void onEnable() {
       // Register commands
       getCommand("pay").setExecutor(new CoinsAPICmd());
       getCommand("money").setExecutor(new CoinsAPICmd());

       // Other initialization code...
   }

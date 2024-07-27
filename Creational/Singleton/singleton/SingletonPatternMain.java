/**
 * Demonstrates the usage of the Singleton pattern by retrieving and modifying the configuration
 * managed by the `ConfigurationManager` class.
 * 
 * This example shows how the Singleton pattern ensures that only a single instance of the
 * `ConfigurationManager` is used throughout the application, and how changes to the configuration
 * are reflected across all references to the singleton instance.
 */

package Singleton.singleton;

public class SingletonPatternMain {
    public static void main(String[] args) {
        // Retrieve the single instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Configuration: " + configManager.getConfiguration());

        // Modify the configuration
        configManager.setConfiguration("New Configuration");
        System.out.println("Updated Configuration: " + configManager.getConfiguration());

        // Ensure the same instance is used
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        System.out.println("Configuration from another reference: " + anotherConfigManager.getConfiguration());
    }
}

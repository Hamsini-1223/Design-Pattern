/**
 * Provides a singleton instance of a configuration manager.
 * The configuration manager allows setting and retrieving a configuration value.
 * This ensures that there is only a single instance of the configuration manager
 * that can be accessed throughout the application.
 */

package Singleton.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configuration;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
        configuration = "Default Configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}

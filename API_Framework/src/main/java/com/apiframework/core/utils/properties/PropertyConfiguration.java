package com.apiframework.core.utils.properties;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PropertyConfiguration {

    public static Configuration getConfig() {

        Parameters params = new Parameters();
        FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                        .configure(params.properties()
                                .setFileName("application.properties"));

        Configuration config = null;
        try {
            config = builder.getConfiguration();
        } catch (ConfigurationException cex) {
            log.error("Couldn't load configuration file: {}", cex.getMessage());
        }
        return config;
    }


    public static String getHomeUrl() {
        return getConfig().getString("home.url");
    }

    public static String getUserLogin() {
        return getConfig().getString("login");
    }

    public static String getUserPassword() {
        return getConfig().getString("password");
    }

    public static String getBrowserName() {
        return getConfig().getString("browser.name");
    }
}

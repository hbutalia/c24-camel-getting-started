package biz.c24.io.configuration;

import org.apache.camel.spring.spi.BridgePropertyPlaceholderConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Resolves property placeholders by first loading properties from properties/application.properties
 * Any property can be overridden by including it in an external property file. The file is loaded at
 * startup by means of a system property called PROPERTY_FILE_LOCATION
 */
@Configuration
public class PropertiesConfiguration {

    private final static Logger LOG = LoggerFactory.getLogger(PropertiesConfiguration.class);

    /**
     * Load all default properties from this location
     */
    private final static String PROPERTY_PATH = "application.properties";

    /**
     * Load properties from an external file. Any properties defined here will override any already defined in the main property path
     */
    private final static String EXTERNAL_PROPERTY_PATH_SYSTEM_VARIABLE_NAME = "PROPERTY_FILE_LOCATION";

    /**
     * If set to false will fail if a property is not found
     */
    private final static boolean IGNORE_UNRESOLVABLE_PLACEHOLDERS = false;

    /**
     * If set to false will fail if the override property file is not specified and/or the file is not found
     */
    private final static boolean IGNORE_RESOURCE_NOT_FOUND = true;


    @Bean
    public static BridgePropertyPlaceholderConfigurer bridgePropertyPlaceholder() {
        BridgePropertyPlaceholderConfigurer bridgePropertyPlaceholderConfigurer = new BridgePropertyPlaceholderConfigurer();
        Resource[] resources = new Resource[ ]
                { new ClassPathResource( PROPERTY_PATH ),
                        new FileSystemResource(System.getProperty(EXTERNAL_PROPERTY_PATH_SYSTEM_VARIABLE_NAME, ""))};
        bridgePropertyPlaceholderConfigurer.setLocations( resources );
        bridgePropertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(IGNORE_UNRESOLVABLE_PLACEHOLDERS);
        bridgePropertyPlaceholderConfigurer.setIgnoreResourceNotFound(IGNORE_RESOURCE_NOT_FOUND);
        return bridgePropertyPlaceholderConfigurer;
    }
}

package spring02_config_properties.lesson14_collection_configuration_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * Collection Configuration Properties
 * <p>
 * - Configuration Properties juga mendukung binding properties untuk jenis collection seperti List atau Map <br>
 * - Hal ini kadang bermanfaat ketika memang data yang kita butuhkan sangat kompleks, bisa Collection yang berisi data
 * sederhana, atau bahkan collection yang berisi Java Bean lagi <br>
 * <p>
 * Embedded Collection
 * <p>
 * - Configuration Properties juga mendukung jika kita membuat Java Bean di dalam collection <br>
 */
@SpringBootTest(classes = Application.class)
public class CollectionConfigurationPropertiesTest {

    @Autowired
    private ApplicationProperties properties;

    @Test
    void collectionConfigurationProperties() {
        Assertions.assertEquals(Arrays.asList("products", "customers", "categories"), properties.getDatabase().getWhitelistTables());
        Assertions.assertEquals(100, properties.getDatabase().getMaxTableSize().get("products"));
        Assertions.assertEquals(100, properties.getDatabase().getMaxTableSize().get("customers"));
        Assertions.assertEquals(100, properties.getDatabase().getMaxTableSize().get("categories"));

        Assertions.assertEquals("default", properties.getDefaultRoles().get(0).getId());
        Assertions.assertEquals("Default Role", properties.getDefaultRoles().get(0).getName());
        Assertions.assertEquals("guest", properties.getDefaultRoles().get(1).getId());
        Assertions.assertEquals("Guest Role", properties.getDefaultRoles().get(1).getName());

        Assertions.assertEquals("admin", properties.getRoles().get("admin").getId());
        Assertions.assertEquals("Admin Role", properties.getRoles().get("admin").getName());
        Assertions.assertEquals("finance", properties.getRoles().get("finance").getId());
        Assertions.assertEquals("Finance Role", properties.getRoles().get("finance").getName());
    }
}

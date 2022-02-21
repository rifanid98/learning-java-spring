package spring02_config_properties.lesson13_complex_configuration_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Complex Configuration Properties
 * <p>
 * - Configuration Properties juga mendukung Java Bean yang kompleks, misal yang berisikan Java Bean object lain <br>
 * - Hal ini membuat pembuatan Configuration Properties menjadi lebih mudah, karena tidak perlu kita lakukan secara manual <br>
 */
@SpringBootTest(classes = Application.class)
public class ComplexConfigurationPropertiesTest {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    void complexConfigurationProperties() {
        Assertions.assertEquals("username", applicationProperties.getDatabase().getUsername());
        Assertions.assertEquals("password", applicationProperties.getDatabase().getPassword());
        Assertions.assertEquals("url", applicationProperties.getDatabase().getUrl());
        Assertions.assertEquals("database", applicationProperties.getDatabase().getDatabase());
    }
}

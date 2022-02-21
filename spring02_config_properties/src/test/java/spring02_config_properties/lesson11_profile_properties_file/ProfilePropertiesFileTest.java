package spring02_config_properties.lesson11_profile_properties_file;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Profile Properties FIle
 * <p>
 * - Saat kita menggunakan fitur profile, kita juga bisa membuat file properties sesuai dengan profile yang aktif <br>
 * - Penamaan properties file adalah application-{profile}.properties <br>
 * - Misal jika active profile adalah dev, maka application-dev.properties akan di load <br>
 * - Jika active profile lebih dari satu, maka semua files properties tiap profile akan di load <br>
 * - Jangan lupa application.properties akan tetap di load disemua profile <br>
 */
@SpringBootTest(classes = Application.class)
@ActiveProfiles({"production", "test"})
public class ProfilePropertiesFileTest {

    @Autowired
    private ProfileProperties profileProperties;

    @Test
    void profileProperties() {
        Assertions.assertEquals("Default", profileProperties.getDefaultFile());
        Assertions.assertEquals("Production", profileProperties.getProductionFile());
        Assertions.assertEquals("Test", profileProperties.getTestFile());
    }
}

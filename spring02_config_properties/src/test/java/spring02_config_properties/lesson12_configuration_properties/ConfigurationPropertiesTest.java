package spring02_config_properties.lesson12_configuration_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Configuration Properties
 * <p>
 * - Spring Boot memiliki sebuah fitur canggih bernama Configuration Properties <br>
 * - Fitur ini bisa digunakan melakukan binding secara otomatis key yang ada di application properties ke Java Bean
 * property secara otomatis <br>
 * - Namun untuk menggunakan fitur ini, kita perlu menambahkan dependency yang dibutuhkan, yaitu spring-boot-configuration-processor <br>
 * <p>
 * Configuration Properties Annotation
 * <p>
 * - Untuk menandai Java Bean agar secara otomatis di binding ke Application Properties, kita perlu menandai class nya
 * dengan annotation ConfigurationProperties <br>
 * - https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/properties/ConfigurationProperties.html  <br>
 * - Selanjutnya kita perlu menentukan prefix untuk key di application properties nya <br>
 * <p>
 * Spring Configuration Metada
 * <p>
 * - Sebenarnya, untuk membuat Spring melakukan automatic binding ke Configuration Properties, kita harus membuat sebuah
 * file metadata <br>
 * - Namun hal tersebut tidak perlu kita lakukan manual, secara otomatis ketika menambahkan dependency configuration
 * properties, dependency tersebut akan melakukan auto generate file metadata dari class yang kita tandai menggunakan
 * annotation ConfigurationProperties <br>
 * - Cara untuk membuat file metadata secara auto generate cukup kita lakukan kompilasi saja project kita, misal jika
 * menggunakan maven, tinggal gunakan perintah : mvn compile <br>
 * <p>
 * Enable Configuration Properties
 * <p>
 * - Secara default, Configuration Properties tidak akan berjalan jika kita tidak beritahukan ke Spring Boot Application <br>
 * - Kita perlu memberitahu bahwa kita membuat class Configuration Properties dengan menggunakan Annotation
 * EnableConfigurationProperties <br>
 * - https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/properties/EnableConfigurationProperties.html  <br>
 */
@SpringBootTest(classes = Application.class)
public class ConfigurationPropertiesTest {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    void configurationProperties() {
        Assertions.assertEquals("Belajar Spring Boot", applicationProperties.getName());
        Assertions.assertEquals(1, applicationProperties.getVersion());
        Assertions.assertFalse(applicationProperties.isProductionMode());
    }
}

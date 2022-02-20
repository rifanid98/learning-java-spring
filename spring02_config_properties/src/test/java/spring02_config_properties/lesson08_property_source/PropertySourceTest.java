package spring02_config_properties.lesson08_property_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Property Source
 * <p>
 * - Secara default, application properties hanya akan mengambil dari file di application.properties yang terdapat di
 * classpath project <br>
 * - Namun, Spring memiliki fitur yang bisa kita gunakan jika kita ingin menambahkan application properties dari file
 * lain, namanya adalah PropertySource <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/PropertySource.html <br>
 * - Kita bisa sebutkan Resource mana yang kita tambahkan ke application properties <br>
 * - Jika kita ingin menambah lebih dari satu property source, kita bisa gunakan annotation PropertySources <br>
 */
@SpringBootTest(classes = Application.class)
public class PropertySourceTest {

    @Autowired
    private SampleProperties properties;

    @Test
    void propertySource() {
        Assertions.assertEquals("Sample Project", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());
    }
}

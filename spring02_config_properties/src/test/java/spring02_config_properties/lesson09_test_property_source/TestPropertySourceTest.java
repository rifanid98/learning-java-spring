package spring02_config_properties.lesson09_test_property_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

/**
 * Test Property Source
 * <p>
 * - Saat membuat unit test, kadang-kadang kita ingin menggunakan properties file yang berbeda untuk mencoba skenario
 * yang berbeda <br>
 * - Hal ini agak sulit jika dilakukan dengan menggunakan Annotation PropertySource <br>
 * - Untungnya di Spring sudah disediakan Annotation TestPropertySource untuk kebutuhan ini, jadi kita bisa menggunakan
 * properties file yang kita mau di unit test <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/context/TestPropertySource.html  <br>
 * - Jika membutuhkan properties file lebih dari satu, kita bisa gunakan annotation TestPropertySources <br>
 */
@SpringBootTest
@TestPropertySources({
        @TestPropertySource("classpath:/test.properties")
})
public class TestPropertySourceTest {

    @Autowired
    private SampleProperties properties;

    @Test
    void testPropertySource() {
        Assertions.assertEquals("Test Project", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());
    }
}

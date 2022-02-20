package spring02_config_properties.lesson07_value;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Value
 * <p>
 * - Value merupakan Annotation yang bisa kita gunakan untuk melakukan inject data dari properties ke field yang kita tandai <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Value.html  <br>
 * <p>
 * Value Application Properties
 * <p>
 * - Annotation Value bisa kita gunakan untuk mengambil data dari application properties <br>
 * - Kita bisa menggunakan kode ${nama.properties.nya} <br>
 * - Secara otomatis akan diambil valuenya, dan secara otomatis akan melakukan konversi juga <br>
 */
@SpringBootTest(classes = Application.class)
public class ValueTest {

    @Autowired
    private ApplicationProperties properties;

    @Test
    void value() {
        Assertions.assertEquals("Belajar Spring Boot", properties.getName());
        Assertions.assertEquals(1, properties.getVersion());
        Assertions.assertFalse(properties.isProductionMode());
        Assertions.assertEquals("JAVA_HOME", properties.getJavaHome());
    }
}

package spring02_config_properties.lesson04_spring_boot_message_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Spring Boot Message Source
 * <p>
 * - Jika kita menggunakan Spring Boot, secara otomatis Spring Boot telah membuat Message Source secara otomatis, kita
 * tidak perlu membuat bean untuk Message Source secara manual <br>
 * - Selain itu secara default, Spring Boot akan membuat Message Source dengan mengambil data resource bundle di
 * messages.properties <br>
 * <p>
 * Message Source Aware
 * <p>
 * - Jika kita ingin menggunakan MessageSource, kita juga bisa menggunakan MessageSourceAware<br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/MessageSourceAware.html <br>
 * - Atau sebenarnya, ApplicationContext adalah turunan dari MessageSource<br>
 */
@SpringBootTest(classes = Application.class)
public class SpringBootMessageSourceTest {

    @Autowired
    private SampleSource sampleSource;

    @Test
    void springBootMessageSoure() {
        Assertions.assertEquals("Hello PZN", sampleSource.hello());
        Assertions.assertEquals("Halo PZN", sampleSource.halo());
    }
}

package spring02_config_properties.lesson03_message_source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * Properties
 * <p>
 * - Pada Kelas Java, kita sudah belajar tentang Properties dan juga cara melakukan Internationalization menggunakan
 * Properties <br>
 * - Di Spring, kita juga melakukan hal yang sama, dengan cara yang lebih baik, tidak perlu melakukannya secara manual <br>
 * <p>
 * Message Source
 * <p>
 * - Spring memiliki fitur yang bernama Message Source, yaitu fitur untuk mengambil message dari resource <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/MessageSource.html  <br>
 * - MessageSource mengkombinasikan Properties dan MessageFormat, sehingga kita tidak perlu melakukannya secara manual
 * seperti yang pernah kita praktekan di kelas Java Internationalization <br>
 * <p>
 * Message Source Implementation
 * <p>
 * - MessageSource adalah sebuah interface, untuk menggunakannya, kita butuh implementasi class nya <br>
 * - Kita tidak butuh membuatnya secara manual, kita bisa menggunakan class implementasi yang sudah disediakan oleh Spring,
 * yaitu ResourceBundleMessageSource <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/support/ResourceBundleMessageSource.html  <br>
 */
public class MessageSourceTest {

    @Test
    void messageSource() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        MessageSource messageSource = context.getBean(MessageSource.class);

        String hello = messageSource.getMessage("hello", new Object[]{"PZN"}, Locale.getDefault());
        String halo = messageSource.getMessage("hello", new Object[]{"PZN"}, new Locale("id", "ID"));
        Assertions.assertEquals("Hello PZN", hello);
        Assertions.assertEquals("Halo PZN", halo);
    }
}

package spring02_config_properties.lesson01_resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Resource
 * <p>
 * - Sebelum kita belajar tentang Config Properties di Spring, kita perlu belajar dulu tentang Resource di Spring <br>
 * - Di Java terdapat fitur bernama Java IO (Input Output) sebagai management resource <br>
 * - Spring membungkus resource dalam sebuah interface bernama Resource <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/io/Resource.html  <br>
 * - Walaupun Resource adalah sebuah interface, untuk membuatnya kita tidak perlu mengimplementasikan secara manual, sudah banyak implementasi class Resource di Spring <br>
 */
public class ResourceTest {

    @Test
    void resource() throws IOException {
        ClassPathResource resource1 = new ClassPathResource("/application.properties");
        ClassPathResource resource2 = new ClassPathResource("/text/sample.txt");

        Assertions.assertNotNull(resource1);
        Assertions.assertNotNull(resource2);

        System.out.println(resource1.getPath());
        System.out.println(resource1.getFilename());
        System.out.println(resource1.getFile().getAbsolutePath());
        System.out.println(resource2.getPath());
        System.out.println(resource2.getFilename());
        System.out.println(resource2.getFile().getAbsolutePath());
    }
}

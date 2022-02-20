package spring02_config_properties.lesson02_resource_loader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * Resource Loader
 * <p>
 * - Spring memiliki fitur yang bisa kita gunakan untuk mengambil data resource secara otomatis, tanpa kita harus membuat
 * object resource nya, namanya ResourceLoader <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/io/ResourceLoader.html  <br>
 * - ResourceLoader memiliki method bernama getResource(String) yang bisa kita gunakan untuk mengambil sebuah resource <br>
 * - ResourceLoader akan mendeteksi jenis Resource yang butuh diambil dari data String nya <br>
 * <p>
 * Resource Loader Aware
 * <p>
 * - ResourceLoader adalah sebuah interface, sehingga untuk menggunakannya, kita perlu implementasi class nya <br>
 * - ApplicationContext adalah turunan dari ResourceLoader, sehingga kita juga bisa menggunakan ApplicationContext untuk
 * mendapatkan Resource <br>
 * - Atau kita juga bisa menggunakan ResourceLoaderAware untuk mendapatkan ResourceLoader secara otomatis <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ResourceLoaderAware.html  <br>
 */
@SpringBootTest(classes = Application.class)
public class ResourceLoaderTest {

    @Autowired
    private SampleResource sampleResource;

    @Test
    void resourceLoader() throws IOException {
        Assertions.assertEquals("PZN", sampleResource.getText().trim());
    }
}

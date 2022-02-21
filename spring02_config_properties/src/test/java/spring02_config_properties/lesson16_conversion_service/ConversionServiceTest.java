package spring02_config_properties.lesson16_conversion_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;

import java.time.Duration;

/**
 * Conversion Service
 * <p>
 * - Conversion Service merupakan inti dari logic untuk melakukan konversi tipe data di Spring <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/convert/ConversionService.html  <br>
 * - Saat kita membuat custom converter, maka kita harus registrasikan ke conversion service <br>
 * - Kita tidak perlu membuat Conversion Service secara manual, karena implementasi class nya sudah disediakan oleh
 * Spring, yaitu ApplicationConversionService <br>
 * - Jika membuat aplikasi berbasis Web, kita tidak perlu melakukannya secara manual, karena sudah otomatis ada di Spring
 * Boot Web, namun karena sekarang kita belum belajar Spring Boot Web, jadi kita perlu membuat Conversion Service secara manual <br>
 * <p>
 * Menggunakan Conversion Service
 * <p>
 * - Conversion Service selain bisa digunakan untuk melakukan konversi tipe data secara otomatis ketika kita menggunakan
 * config properties, tapi juga bisa digunakan secara programmatically untuk melakukan konversi tipe data <br>
 * - Caranya cukup kita ambil object ConversionService <br>
 */
@SpringBootTest(classes = Application.class)
public class ConversionServiceTest {

    @Autowired
    private ApplicationProperties properties;

    @Autowired
    private ConversionService conversionService;

    @Test
    void conversionService() {
        Assertions.assertTrue(conversionService.canConvert(String.class, Duration.class));
        Assertions.assertEquals(Duration.ofSeconds(10), conversionService.convert("10s", Duration.class));
    }
}

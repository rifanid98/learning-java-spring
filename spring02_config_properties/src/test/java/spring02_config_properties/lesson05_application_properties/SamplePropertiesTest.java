package spring02_config_properties.lesson05_application_properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

/**
 * Application Properties
 * <p>
 * - Saat kita membuat project Spring menggunakan start.spring.io, secara otomatis terdapat sebuah file application.properties <br>
 * - File ini adalah pusat dari file properties untuk konfigurasi aplikasi Spring yang kita buat <br>
 * - Secara otomatis, Spring Boot akan membaca konfigurasi yang kita masukkan ke dalam file application.properties <br>
 * - Ini bukanlah file untuk Internationalization, melainkan file ini digunakan untuk konfigurasi aplikasi, jika kita
 * butuh pesan untuk Internationalization, gunakan file messages.properties seperti yang sudah kita bahas sebelumnya <br>
 * <p>
 * Mengakses Application Properties
 * <p>
 * - Ada banyak cara untuk mengakses konfigurasi yang terdapat di application.properties, nanti akan dibahas di chapter masing-masing
 */
@SpringBootTest(classes = Application.class)
public class SamplePropertiesTest {

    @Autowired
    private Environment environment;

    @Test
    void applicationProperties() {
        String applicationName = environment.getProperty("application.name");
        Assertions.assertEquals("Belajar Spring Boot", applicationName);
    }
}

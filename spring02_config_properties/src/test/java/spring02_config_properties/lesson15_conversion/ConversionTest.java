package spring02_config_properties.lesson15_conversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * Conversion
 * <p>
 * - Saat kita menggunakan config properties di Spring, ada pertanyaan, bagaimana Spring melakukan konversi data yang
 * ada di properties file ke tipe data di Java? <br>
 * - Jawabannya adalah karena Spring memiliki mekanisme konversi tipe data. <br>
 * - Secara default, hampir semua tipe data umum di Java didukung, namun bagaimana jika tipe data yang kita buat sendiri? <br>
 * - Jika ada kasus seperti itu, kita bisa membuat class Conversion sendiri <br>
 * <p>
 * Converter Interface
 * <p>
 * - Semua konversi tipe data di Spring sudah dibuat standarisasinya, yaitu menggunakan interface Converter <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/convert/converter/Converter.html  <br>
 * <p>
 * Default Converter
 * <p>
 * - Secara default, Spring juga sudah menyediakan Converter untuk tipe data bawaan Java, seperti Number, Boolean, Date,
 * Calendar, Duration, dan lain-lain <br>
 * - Kita bisa lihat secara semua class turunan dari Converter <br>
 * <p>
 * Custom Converter
 * <p>
 * - Jika ada kasus yang akhirnya mengharuskan kita membuat converter sendiri, kita bisa dengan mudah membuat class
 * turunan interface Converter <br>
 * - Misal kita coba buat Converter untuk tipe data String ke Date <br>
 * <p>
 * Kenapa Error?
 * <p>
 * - Secara default, jika kita ingin menggunakan custom Converter, kita harus registrasikan ke ConversionService <br>
 * - ConversionService akan kita bahas di materi selanjutnya <br>
 */
@SpringBootTest(classes = Application.class)
public class ConversionTest {

    @Autowired
    private ApplicationProperties properties;

    @Test
    void conversion() {
        Assertions.assertEquals(Duration.ofSeconds(10), properties.getDefaultTimeout());
        Date expireDate = properties.getExpireDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Assertions.assertEquals("2020-10-10", dateFormat.format(expireDate));
    }
}

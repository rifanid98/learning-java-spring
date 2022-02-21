package spring02_config_properties.lesson17_externalized_properties_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

/**
 * Externalized Properties File
 * <p>
 * - Saat aplikasi Spring Boot kita sudah selesai, semua config properties akan dibungkus di dalam jar file <br>
 * - Pertanyaannya bagaimana jika kita ingin mengubah isi informasi nya? <br>
 * - Misal konfigurasi database tidak mungkin kita simpan di dalam kode program <br>
 * - Ada beberapa cara untuk menggunakan configuration dari luar aplikasi, ketika aplikasi kita sudah menjadi jar file <br>
 * <p>
 * External Properties File
 * <p>
 * - Pertama kita bisa membuat application.properties file dari luar, lalu ketika menjalankan aplikasi Jar Spring Boot
 * kita, kita bisa menyebutkan lokasi application.properties nya <br>
 * - Caranya kita bisa gunakan perintah : <br>
 * java -jar lokasi/file.jar --spring.config.location=lokasi/file/application.properties
 */
@SpringBootApplication
@EnableConfigurationProperties({
        ApplicationProperties.class,
})
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
    }
}

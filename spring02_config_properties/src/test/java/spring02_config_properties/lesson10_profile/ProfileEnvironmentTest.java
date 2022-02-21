package spring02_config_properties.lesson10_profile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Profile
 * <p>
 * - Profile merupakan fitur di Spring yang bisa kita gunakan untuk menentukan component jalan di profile mana <br>
 * - Profile cocok sekali ketika kita butuh component berbeda pada kondisi tertentu, misal kita buat component untuk
 * koneksi ke Memory Database, tapi jika di Local misal, kita ingin component nya diganti dengan koneksi di memory aplikasi saja <br>
 * - Untuk menandai sebuah component dengan informasi Profile, kita bisa menggunakan Annotation Profile <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Profile.html  <br>
 * <p>
 * Profile Properties
 * <p>
 * - Untuk menentukan profile apa yang berjalan, kita bisa menentukannya di application properties dengan menggunakan
 * key spring.profiles.active <br>
 * - Dimana kita bisa menentukan active profile lebih dari satu jika kita mau <br>
 * <p>
 * Active Profile
 * <p>
 * - Kadang jika harus mengubah profile di application properties akan menyulitkan ketika kita membuat unit test untuk
 * beberapa profile <br>
 * - Untuk mengubah profile di unit test, kita bisa menggunakan annotation ActiveProfiles <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/context/ActiveProfiles.html  <br>
 * <p>
 * Profile di Environment
 * <p>
 * - Kadang kita ingin mendapatkan profile pada saat aplikasi berjalan <br>
 * - Jika ada kasus seperti ini, kita bisa menggunakan Environment <br>
 * - Terdapat method getActiveProfiles() untuk mendapatkan profile yang sedang aktif <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/Environment.html#getActiveProfiles--  <br>
 */
@SpringBootTest(classes = Application.class)
@ActiveProfiles({
        "local",
        "production"
})
public class ProfileEnvironmentTest {

    @Autowired
    private SampleProfile sampleProfile;

    @Test
    void profileEnvironment() {
        Assertions.assertArrayEquals(new String[]{"local", "production"}, sampleProfile.getActiveProfiles());
    }
}

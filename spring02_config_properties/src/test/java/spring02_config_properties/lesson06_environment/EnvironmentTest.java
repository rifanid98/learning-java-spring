package spring02_config_properties.lesson06_environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

/**
 * Environment
 * <p>
 * - Environment tidak hanya bisa digunakan untuk mengakses Application Properties <br>
 * - Environment juga bisa digunakan untuk mengakses data environment variable pada sistem operasi <br>
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/Environment.html  <br>
 * - Kita bisa menggunakan EnvironmentAware jika ingin mendapatkan object Environment <br>
 */
@SpringBootTest(classes = Application.class)
public class EnvironmentTest {

    @Autowired
    private Environment environment;

    @Test
    void environment() {
        String java_home = environment.getProperty("JAVA_HOME");
        System.out.println(java_home); // jika null, berarti env JAVA_HOME belum diset. di Intellij IDEA harus diset dulu
    }
}

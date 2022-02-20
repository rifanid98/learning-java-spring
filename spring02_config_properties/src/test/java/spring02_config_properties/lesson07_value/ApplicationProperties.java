package spring02_config_properties.lesson07_value;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ApplicationProperties {

    @Value("${application.name}")
    private String name;

    @Value("${application.version}")
    private Integer version;

    @Value("${application.production-mode}")
    private boolean productionMode;

    /**
     * Value System Variable
     * <p>
     * - Selain application properties, Annotation Value juga bisa digunakan untuk mengambil data dari system properties
     * atau environment variable
     * - Caranya sama seperti mengambil application properties
     * - Secara otomatis akan diambil valuenya, dan secara otomatis akan melakukan konversi juga
     */
    @Value("${JAVA_HOME}")
    private String javaHome;
}

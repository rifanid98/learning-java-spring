package spring02_config_properties.lesson13_complex_configuration_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("applicationss")
//@ConfigurationProperties("application") // commented to avoid error duplicate
public class ApplicationProperties {

    private String name;

    private Integer version;

    private boolean productionMode;

    private DatabaseProperties database;

    @Getter
    @Setter
    public static class DatabaseProperties {
        private String username;

        private String password;

        private String database;

        private String url;
    }
}

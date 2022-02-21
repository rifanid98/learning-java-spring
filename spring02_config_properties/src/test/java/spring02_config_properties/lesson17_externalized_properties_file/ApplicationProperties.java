package spring02_config_properties.lesson17_externalized_properties_file;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private String name;

    private Integer version;

    private boolean productionMode;
}

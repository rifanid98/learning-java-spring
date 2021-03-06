package spring02_config_properties.lesson12_configuration_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("applications")
//@ConfigurationProperties("application") // commented to avoid error duplicate
public class ApplicationProperties {

    private String name;

    private Integer version;

    private boolean productionMode;
}

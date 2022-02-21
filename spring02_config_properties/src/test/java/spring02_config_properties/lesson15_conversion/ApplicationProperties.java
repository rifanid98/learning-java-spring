package spring02_config_properties.lesson15_conversion;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.Date;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private Duration defaultTimeout;

    private Date expireDate;
}

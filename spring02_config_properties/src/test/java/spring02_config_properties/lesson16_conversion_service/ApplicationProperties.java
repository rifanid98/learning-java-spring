package spring02_config_properties.lesson16_conversion_service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;
import java.util.Date;

@Getter
@Setter
@ConfigurationProperties("applicationsssss")
//@ConfigurationProperties("application") // commented to avoid error duplicate
public class ApplicationProperties {

    private Duration defaultTimeout;

    private Date expireDate;
}

package spring02_config_properties.lesson09_test_property_source;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SampleProperties {

    @Value("${sample.name}")
    private String name;

    @Value("${sample.version}")
    private Integer version;
}

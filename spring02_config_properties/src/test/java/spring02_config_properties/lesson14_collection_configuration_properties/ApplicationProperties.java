package spring02_config_properties.lesson14_collection_configuration_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties("application")
public class ApplicationProperties {

    private String name;

    private Integer version;

    private boolean productionMode;

    private List<String> whitelistTables;

    private Map<String, Integer> maxTableSize;
}

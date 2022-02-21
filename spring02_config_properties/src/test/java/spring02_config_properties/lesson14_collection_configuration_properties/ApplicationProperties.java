package spring02_config_properties.lesson14_collection_configuration_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties("applicationsss")
//@ConfigurationProperties("application") // commented to avoid error duplicate
public class ApplicationProperties {

    private String name;

    private Integer version;

    private boolean productionMode;

    private List<Role> defaultRoles;

    private Map<String, Role> roles;

    private DatabaseProperties database;

    @Getter
    @Setter
    public static class DatabaseProperties {
        private String username;

        private String password;

        private String database;

        private String url;

        private List<String> whitelistTables;

        private Map<String, Integer> maxTableSize;
    }

    @Getter
    @Setter
    public static class Role {
        private String id;

        private String name;
    }
}

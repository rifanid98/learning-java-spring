package spring02_config_properties.lesson10_profile;

import lombok.Setter;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SampleProfile implements EnvironmentAware {

    @Setter
    private Environment environment;

    public String[] getActiveProfiles() {
        return environment.getActiveProfiles();
    }
}

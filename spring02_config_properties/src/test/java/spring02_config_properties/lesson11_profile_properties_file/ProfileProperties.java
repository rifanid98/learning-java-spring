package spring02_config_properties.lesson11_profile_properties_file;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ProfileProperties {

    @Value("${profile.default}")
    private String defaultFile;

    @Value("${profile.production}")
    private String productionFile;

    @Value("${profile.test}")
    private String testFile;
}

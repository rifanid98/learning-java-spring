package spring02_config_properties.lesson10_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"local"})
public class SayHelloLocal implements SayHello {
    @Override
    public String say(String name) {
        return "Hello " + name + " from Local";
    }
}

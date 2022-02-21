package spring02_config_properties.lesson10_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"production"})
public class SayHelloProduction implements SayHello {
    @Override
    public String say(String name) {
        return "Hello " + name + " from Production";
    }
}

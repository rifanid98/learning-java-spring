package spring01_dasar.lesson19_component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "spring01_dasar.lesson19_component"
})
public class BeanConfiguration {
}

package spring01_dasar.lesson18_component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "spring01_dasar.lesson18_component_scan"
})
public class BeanConfiguration {
}

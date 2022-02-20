package spring01_dasar.lesson29_ordered;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class,
        PrefixIdGeneratorBeanPostProcessor.class
})
public class BeanConfiguration {
}

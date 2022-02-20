package spring01_dasar.lesson31_bean_factory_post_processor;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FooBeanFactoryPostProcessor.class})
public class BeanConfiguration {
}

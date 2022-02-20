package spring01_dasar.lesson32_event_listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        LoginSuccessListener.class,
        UserService.class
})
public class BeanConfiguration {
}

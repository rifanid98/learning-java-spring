package spring02_config_properties.lesson04_spring_boot_message_source;

import lombok.Setter;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class SampleSource implements MessageSourceAware {

    @Setter
    private MessageSource messageSource;

    public String hello() {
        return messageSource.getMessage("hello", new Object[]{"PZN"}, Locale.getDefault());
    }

    public String halo() {
        return messageSource.getMessage("hello", new Object[]{"PZN"}, new Locale("id", "ID"));
    }
}

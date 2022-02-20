package spring02_config_properties.lesson02_resource_loader;

import lombok.Setter;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SampleResource implements ResourceLoaderAware {

    @Setter
    private ResourceLoader resourceLoader;

    public String getText() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:/text/resource.txt");
        try (var inputStream = resource.getInputStream()) {
            return new String(inputStream.readAllBytes());
        }
    }
}

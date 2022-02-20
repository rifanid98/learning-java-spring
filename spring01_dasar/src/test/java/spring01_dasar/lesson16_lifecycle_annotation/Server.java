package spring01_dasar.lesson16_lifecycle_annotation;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

    @PostConstruct
    public void start() {
        log.info("Start server");
    }

    @PreDestroy
    public void stop() {
        log.info("Stop server");
    }
}

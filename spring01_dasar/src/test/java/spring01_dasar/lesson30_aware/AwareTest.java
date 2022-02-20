package spring01_dasar.lesson30_aware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Aware
 * <p>
 * - Spring memiliki sebuah interface berama Aware
 * - Aware adalah super interface yang digunakan untuk semua Aware interface
 * - Aware ini diperuntukkan untuk penanda agar Spring melakukan injection object yang kita butuhkan
 * - Mirip seperti yang sudah kita lakukan ketika membuat IdAware menggunakan IdGenerator Bean Post Processor
 * - Namun untuk ini, kita tidak perlu lagi membuat Bean Post Processor secara manual
 * - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/Aware.html
 */
public class AwareTest {

    @Test
    void aware() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AuthService authService = context.getBean(AuthService.class);

        Assertions.assertNotNull(authService);
        Assertions.assertEquals("spring01_dasar.lesson30_aware.AuthService", authService.getBeanName());
        Assertions.assertEquals(context, authService.getApplicationContext());
    }
}

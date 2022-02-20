package spring01_dasar.lesson23_qualifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Qualifier
 * <p>
 * - Seperti yang sudah dijelaskan di awal, jika terdapat bean dengan tipe data yang sama lebih dari satu, maka secara
 * otomatis Spring akan bingung memilih bean yang mana yang akan digunakan
 * - Kita perlu memilih salah satu menjadi primary, yang secara otomatis akan dipilih oleh Spring
 * - Namun jika kita ingin memilih bean secara manual, kita juga bisa menggunakan @Qualifier
 * - Kita bisa tambahkan @Qualifier di constructor parameter, di setter method atau di field
 */
public class QualifierTest {

    @Test
    void qualifier() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        context.registerShutdownHook();
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertNotNull(normalCustomerRepository);
        Assertions.assertNotNull(premiumCustomerRepository);
        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }
}

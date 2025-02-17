package belajar.sprint.boot.core.configuration;

import belajar.sprint.boot.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerRepositoryConfiguration {

    @Primary
    @Bean
    public CustomerRepository freeCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
}

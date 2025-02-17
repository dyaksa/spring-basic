package belajar.sprint.boot.core.service;

import belajar.sprint.boot.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired // not recommended
    @Qualifier("freeCustomerRepository")
    private CustomerRepository freeCustomerRepository;

    @Getter
    @Autowired // not recommended
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}

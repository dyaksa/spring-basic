package belajar.sprint.boot.core.service;

import belajar.sprint.boot.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired // not recommended
    private CustomerRepository customerRepository;
}

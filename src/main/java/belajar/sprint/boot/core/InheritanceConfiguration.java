package belajar.sprint.boot.core;

import belajar.sprint.boot.core.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImpl.class
})
public class InheritanceConfiguration {
}

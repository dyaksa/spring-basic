package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.MultiFoo;
import belajar.sprint.boot.core.repository.CategoryRepository;
import belajar.sprint.boot.core.repository.CustomerRepository;
import belajar.sprint.boot.core.repository.ProductRepository;
import belajar.sprint.boot.core.service.CategoryService;
import belajar.sprint.boot.core.service.CustomerService;
import belajar.sprint.boot.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    public void testComponent() {
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean("productService",ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    public void testDependencyInjection() {
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        ProductService productService = context.getBean(ProductService.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    public void testSetterDeoendencyInjection() {
        CategoryService categoryService = context.getBean(CategoryService.class);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    public void testFieldDependencyInjection() {
        CustomerService customerService = context.getBean(CustomerService.class);
        CustomerRepository freeCustomerRepository = context.getBean("freeCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository.class);

        Assertions.assertSame(freeCustomerRepository, customerService.getFreeCustomerRepository());

        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }

    @Test
    public void testObjectProvider() {
        MultiFoo multiFoo = context.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFooLists().size());
    }
}

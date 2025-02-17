package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.Connection;
import belajar.sprint.boot.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    @DependsOn("server")
    public Connection connection() {
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}

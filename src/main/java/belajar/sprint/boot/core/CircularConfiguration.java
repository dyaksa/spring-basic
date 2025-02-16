package belajar.sprint.boot.core;

import belajar.sprint.boot.core.data.cyclic.CyclicA;
import belajar.sprint.boot.core.data.cyclic.CyclicB;
import belajar.sprint.boot.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularConfiguration {
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}

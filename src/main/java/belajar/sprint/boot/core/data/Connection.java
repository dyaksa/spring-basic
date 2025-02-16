package belajar.sprint.boot.core.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("Close connection");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Open connection");
    }
}

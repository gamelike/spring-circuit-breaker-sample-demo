package org.example.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feign.ServerClient;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author violet
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class InitPostBeanProcessor {

    private final ServerClient client;

    @PostConstruct
    public void init() {
        String hello = client.hello();
        log.info("hello : {}", hello);
    }

}

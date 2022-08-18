package org.example.init;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feign.ServerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * trigger bug <br/>
 * inject bean to application context (singletonObjects) <br/>
 *
 * @author violet
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class Config {

    private final ServerClient client;

    static class Init {
    }

    @Bean
    public Init init() {
        String hello = client.hello();
        // NOTE : this is hello server, but always fallback.
        log.info("hello : {}", hello);
        return new Init();
    }
}

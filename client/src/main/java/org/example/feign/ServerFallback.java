package org.example.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author violet
 */
@Slf4j
@Service
public class ServerFallback implements ServerClient {
    @Override
    public String hello() {
        log.error("fallback is triggered.");
        return null;
    }
}

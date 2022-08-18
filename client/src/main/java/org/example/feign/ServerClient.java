package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author violet
 */
@FeignClient(name = "server", url = "localhost:8080", fallback = ServerFallback.class)
public interface ServerClient {

    @GetMapping("hello")
    String hello();

}

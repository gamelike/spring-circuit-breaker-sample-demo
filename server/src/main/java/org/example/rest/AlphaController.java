package org.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author violet
 */
@RestController
public class AlphaController {

    @GetMapping("hello")
    public String getString() {
        return "Hello server";
    }

}

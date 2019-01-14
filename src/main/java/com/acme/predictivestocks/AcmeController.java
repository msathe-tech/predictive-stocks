package com.acme.predictivestocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcmeController {
    private static Logger log = LoggerFactory.getLogger(AcmeController.class);


    @GetMapping("/service/greet/{name}")
    public String sayHello(@PathVariable String name) {
        return String.format("Hello %s! \n Use ACME's predictive stock recommendation and retire early. \n", name);
    }

    @GetMapping("/service/quote")
    public String sayHello() {
        return String.format("Today's top stock: PVTL");
    }

    @GetMapping("/kill-instance")
    public void die()
    {
        log.error("Bye bye app-instance, RIP!");
        System.exit(-1);
    }
}

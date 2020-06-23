package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvokerController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/invoker-hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println("sssss");
        return helloService.hello(name);
    }
}

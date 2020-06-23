package controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client")
public interface HelloService {
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}

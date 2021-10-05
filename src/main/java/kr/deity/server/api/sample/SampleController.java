package kr.deity.server.api.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {

    @RequestMapping("")
    public String helloMessage(){
        return "hello, deity";
    }
}

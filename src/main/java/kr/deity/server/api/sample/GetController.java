package kr.deity.server.api.sample;

import kr.deity.server.api.sample.models.Posts;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/param")
public class GetController {

    @GetMapping
    public String stringParam(String s){
        return s;
    }

    @GetMapping("/requestParam")
    public String rquestParam(@RequestParam String id){
        return id;
    }

    @GetMapping("/requestParamMap")
    public String requestParamMap(@RequestParam Map<String,String> param){
        String a = param.get("id");
        String b = param.get("b");

        return a;
    }

    @GetMapping("/path/{id}/{b}")
    public String requestPathVariable(@PathVariable String id,@PathVariable String b){
        return id;
    }

    @GetMapping("/modelMapping")
    public String a(@ModelAttribute Posts posts){
        return posts.getId();
    }
}

package kr.deity.server.api.sample;

import kr.deity.server.api.sample.models.Posts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/response")
public class ResponseController {


    @GetMapping("/reponseString")
    public String reponseString(){
        return "test";
    }

    @GetMapping("/reponseModel")
    public Posts reponseModel(){
        return new Posts();
    }

    @GetMapping("/responseObject")
    public Object responseObject(){
        Map<String, String> map = new HashMap<>();

        map.put("id","11111");
        return map;
    }

    @GetMapping("/reponseList")
    public List<String> reponseList(){
        List<String> list = new ArrayList<>();

        String id = "1111";
        list.add(id);

        return list;
    }

    @GetMapping("/reponseListModel")
    public List<Posts> reponseListModel(){

        List<Posts> list = new ArrayList<>();
        Posts posts = new Posts();
        posts.setId("1111");
        posts.setSubject("디시이즈컴패니");
        posts.setContent("여기서");
        list.add(posts);
        return list;
    }

    @GetMapping("/reonseListMap")
    public List<Map> reonseListMap(){
        List<Map> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("id","11111");

        list.add(map);

        return list;
    }

}

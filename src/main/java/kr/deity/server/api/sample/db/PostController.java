package kr.deity.server.api.sample.db;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController<E extends Posts> {

    @RequestMapping("/create")
    public void createData(){

    }

    @RequestMapping("/update")
    public void updateData(){

    }

    @RequestMapping("/delete")
    public void deleteData(){

    }

    @RequestMapping("/put")
    public void putData(){

    }

    @RequestMapping("/get")
    public E getData(){

        String title = "테스트 게시글";
        String content = "테스트 본문";
        ;

        Posts posts = Posts.builder().title(title).content(content).build();

        return (E) posts;
    }

    @RequestMapping("/list")
    public List<E> listData(){
        List<E> list = new ArrayList<>();

        return list;
    }

    @RequestMapping("/sample")
    public E sample(){
        E e = null;
//        DefaultDomain d = new DefaultDomain();
        return e;
    }


}

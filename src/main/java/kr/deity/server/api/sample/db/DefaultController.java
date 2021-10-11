package kr.deity.server.api.sample.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db")
public class DefaultController<E extends DefaultDomain> {

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
        DefaultDomain d = new DefaultDomain();

        return (E) d;
    }

    @RequestMapping("/list")
    public List<E> listData(){
        List<E> list = new ArrayList<>();


        return list;
    }

    @RequestMapping("/sample")
    public E sample(){
        DefaultDomain d = new DefaultDomain();
        return (E) d;
    }
}

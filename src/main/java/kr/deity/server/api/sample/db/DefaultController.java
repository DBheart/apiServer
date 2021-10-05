package kr.deity.server.api.sample.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db")
public class DefaultController {

    @Autowired
    private DefaultService defaultService;

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
    public DefaultDomain getData(){
//        DefaultDomain d = new DefaultDomain();

        return null;
    }

    @RequestMapping("/list")
    public List<DefaultDomain> listData(){
        List<DefaultDomain> list = new ArrayList<>();

        defaultService.listAll();
        return list;
    }

    @RequestMapping("/sample")
    public DefaultDomain sample(){
//        DefaultDomain d = new DefaultDomain();
        return null;
    }
}

package kr.deity.server.api.sample.db;

import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

public interface BaseController<E> {

    @RequestMapping("/create")
    public void createData(E entity);

    @RequestMapping("/update")
    public void updateData(E entity);

    @RequestMapping("/delete")
    public void deleteData(E entity);

    @RequestMapping("/put")
    public void putData(E entity);

    @RequestMapping("/get")
    public E getData(String id);

    @RequestMapping("/list")
    public List<E> listData();
}

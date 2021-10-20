package kr.deity.server.api.sample;


import kr.deity.server.api.sample.models.Posts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apisample")
public class ApiController {
    Logger logger = LoggerFactory.getLogger(ApiController.class.getName());

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(Posts posts){
        logger.info("create");
    }

    @PutMapping
    @ResponseStatus(HttpStatus.RESET_CONTENT)
    public void update(Posts posts){
        logger.info("modify data");
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Posts posts){
        logger.info("delete data");

    }

    @GetMapping
    public Posts get(String id){
        return new Posts();
    }

    @GetMapping("/find")
    public List<Posts> findList(String name){
        return new ArrayList<>();
    }

    @GetMapping("findAll")
    public List<Posts> findAll(){
        return new ArrayList<>();
    }

    @GetMapping("notfound")
    public List<Posts> notFound(){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"조회조건에 맞는 데이터가 존재하지 않습니다.");
    }

    /**
     * 500오류가 나는건 일부러 할필요가 있을까?
     * 오류의 리턴값과 성공의 리턴값을 맞출때는 괜찮은것 같다.
     * @return
     */
    @GetMapping("runtimeerror")
    public List<Posts> runtimeException(){
//        throw new BaseException("오류가 발생하였습니다.");
        throw new RuntimeException("오류가 발생하였습니다.");
    }

}

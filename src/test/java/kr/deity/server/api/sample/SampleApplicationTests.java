package kr.deity.server.api.sample;

import kr.deity.server.api.sample.db.DefaultDomain;
import kr.deity.server.api.sample.db.DefaultDomainRepository;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SampleApplicationTests {

    @Autowired
    DefaultDomainRepository defaultDomainRepository;

    @After
    public void cleanup() {
        defaultDomainRepository.deleteAll();
    }
    @Test
    public void 기본필드_테스트(){
        String id ="1";
        String user ="deity";
        String date = "20211002";


        defaultDomainRepository.save(DefaultDomain.builder()
        .id(id).user(user).date(date).build());

        List<DefaultDomain> list = defaultDomainRepository.findAll();

        System.out.println("message"+list.get(0).getCreateUser());
    }

    @Test
    void contextLoads() {
    }

}

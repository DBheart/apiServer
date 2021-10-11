package kr.deity.server.api.sample;

import kr.deity.server.api.sample.user.User;
import kr.deity.server.api.sample.user.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void cleanup() {userRepository.deleteAll();}

    @Test
    public void get(){
        String id = "1";
        String userName = "김규표";
        String phone="11111";

        userRepository.save(User.builder().id(id).userName(userName).build());

        User user = userRepository.getById("1");

        System.out.println("userNmae :"+user.getUserName());
    }

}

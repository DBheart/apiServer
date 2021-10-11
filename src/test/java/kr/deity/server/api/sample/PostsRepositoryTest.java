package kr.deity.server.api.sample;

import kr.deity.server.api.sample.db.Posts;
import kr.deity.server.api.sample.db.PostsRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    //After : 테스트 단위가 끝날때마다 수행되는 메서드를 지정하는 어노테이션
    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {

        String title = "테스트 게시글";
        String content = "테스트 본문";

        //builder 클래스를 통해 생성자 생성 후 save (insert/update)
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("sksim@gmail.com")
                .build());

        List<Posts> postsList = postsRepository.findAll();
        Posts posts = postsList.get(0);


//        Assert.assertEquals();

        System.out.println("message :"+posts.getId());
    }
}

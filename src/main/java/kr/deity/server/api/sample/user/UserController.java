package kr.deity.server.api.sample.user;

import kr.deity.server.api.sample.db.BaseController;
import kr.deity.server.api.sample.db.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * userRepository 도 repository로 넘겨 버렸으면 좋겠다.
 * 아마 있을껄?
 * @param <E>
 */
@RestController
@RequestMapping("/user")
public class UserController<E extends User> implements BaseController<E> {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createData(@RequestBody E entity) {
        userRepository.save(entity);
    }

    @Override
    public void updateData(E entity) {
        userRepository.save(entity);
    }

    @Override
    public void deleteData(E entity) {
        userRepository.delete(entity);
    }

    @Override
    public void putData(E entity) {
        userRepository.save(entity);
    }

    @Override
    public E getData(@RequestBody String id) {
        System.out.println("id :"+ id);
        User u = userRepository.getById(id);

        System.out.println(u);
        return (E) u;
    }

    @Override
    public List<E> listData() {

        List<User> list = userRepository.findAll();
        return (List<E>) list;
    }
}

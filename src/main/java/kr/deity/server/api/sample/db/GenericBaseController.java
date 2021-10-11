package kr.deity.server.api.sample.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * S에 대하 정립이 되지 않으면 쓸수가 없네?
 * @param <E>
 * @param <S>
 */
public class GenericBaseController<E,S extends CrudRepository> implements BaseController<E>{

    @Autowired
    S repository;

    @Override
    public void createData(E entity) {

    }

    @Override
    public void updateData(E entity) {

    }

    @Override
    public void deleteData(E entity) {

    }

    @Override
    public void putData(E entity) {

    }

    @Override
    public E getData(String id) {
        return null;
    }

    @Override
    public List<E> listData() {
        return null;
    }
}

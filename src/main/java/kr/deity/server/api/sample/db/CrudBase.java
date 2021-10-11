package kr.deity.server.api.sample.db;

import java.util.List;

/**
 * 컨트롤에 대한 베이스이다.
 * 아마... 이제는 지우너이 되어있을것이다.
 * 리턴값은 통일해야한다.
 * @param <E>
 */
public interface CrudBase<E> {

    public int create(E entity);

    public int update(E entity);

    public int delete(E entity);

    public int put(E entity);
    /**
     * view or get
     * @param entity
     * @return
     */
    public E view(E entity);

    public List<E> list(E entity);
}

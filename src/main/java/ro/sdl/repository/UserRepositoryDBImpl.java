package ro.sdl.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sdl.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

/**
 * User: Ovidiu Petridean <opetridean@sdl.com>
 * Date: 29.10.2012
 */

@Repository
@Transactional
public class UserRepositoryDBImpl implements UserRepository{

    @PersistenceContext
    private EntityManager em;

    public void add(User user) {
        em.persist(user);
    }

    public User get(Integer id) {
        return em.find(User.class, id);
    }

    public void update(User user) {
        em.merge(user);
    }

    public void delete(User user) {
        em.remove(user);
    }

    public Collection<User> getAll() {
        List<User> userList = em.createQuery("select u from User u", User.class).getResultList();
        return userList;
    }

}

package ro.sdl.repository;

import ro.sdl.domain.*;

import java.util.Collection;
import java.util.List;


public interface UserRepository {

    void add(User user);

    User get(Integer id);

    void update(User user);

    void delete(User user);

    Collection<User> getAll();

}

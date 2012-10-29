package ro.sdl.service;

import ro.sdl.domain.*;

import java.util.Collection;

public interface UserService {

    public Boolean associateUserToProject(Project project, User user);

    void add(User user);

    User get(Integer id);

    void update(User user);

    void delete(User user);

    Collection<User> getAll();

}

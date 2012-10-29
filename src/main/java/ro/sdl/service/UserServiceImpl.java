package ro.sdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sdl.domain.Project;
import ro.sdl.domain.User;
import ro.sdl.repository.UserRepository;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    public Boolean associateUserToProject(Project project, User user) {
        //userRepository.add();
        return null;
    }

    public void add(User user) {
        userRepository.add(user);
    }

    public User get(Integer id) {
        return userRepository.get(id);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public Collection<User> getAll() {
        return userRepository.getAll();
    }
}

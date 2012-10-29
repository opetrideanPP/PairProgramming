package ro.sdl.repository;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;

import java.util.Collection;
import java.util.List;

public class UserRepositoryMemoryImpl implements UserRepository {


//    public User load(long userId) throws RepositoryException {
//        for (User currentUser : AppDataLoader.users) {
//            if (currentUser.getId() == userId) {
//                return currentUser;
//            }
//
//        }
//        return null;
//    }
//
//    public Collection<User> getUsers() throws RepositoryException {
//        return AppDataLoader.users;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void add(User user) throws RepositoryException {
//        AppDataLoader.users.add(user);
//    }
//
//    public void update(User user) throws RepositoryException {
//        for (User currentUser : AppDataLoader.users) {
//            if (currentUser.getId() == user.getId()) {
//                currentUser.setName(user.getName());
//                currentUser.setRole(user.getRole());
//                currentUser.setState(user.getState());
//                currentUser.setProject(user.getProject());
//
//            }
//
//        }
//    }
//
//    public void delete(long userId) throws RepositoryException {
//        for (User currentUser : AppDataLoader.users) {
//            if (currentUser.getId() == userId) {
//                AppDataLoader.users.remove(currentUser);
//
//            }
//
//        }
//    }

    public void add(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public User get(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void update(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void delete(User user) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<User> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Project> getUserProjects(User user) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

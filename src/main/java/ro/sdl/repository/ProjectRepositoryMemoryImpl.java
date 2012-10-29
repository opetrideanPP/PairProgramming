package ro.sdl.repository;

import ro.sdl.domain.Project;

import java.util.Collection;

public class ProjectRepositoryMemoryImpl implements ProjectRepository {

//
//    public Project load(Integer projectId) throws RepositoryException {
//        for (Project currentProject : AppDataLoader.projects) {
//            if (currentProject.getId() == projectId) {
//                return currentProject;
//            }
//        }
//        return null;
//    }
//
//    public Collection<Project> getProjects() throws RepositoryException {
//        return AppDataLoader.projects;
//    }
//
//    public void add(Project project)  {
//        AppDataLoader.projects.add(project);
//    }
//
//    public Project get(Integer id) {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void update(Project project)  {
//        for (Project currentProject : AppDataLoader.projects) {
//            if (currentProject.getId() == project.getId()) {
//                currentProject.setUsers(project.getUsers());
//                currentProject.setDescription(project.getDescription());
//            }
//        }
//    }
//
//    public void delete(Project project) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public Collection<Project> getAll() {
//        return null;  //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void delete(Integer projectId) throws RepositoryException {
//        for (Project currentProject : AppDataLoader.projects) {
//            if (currentProject.getId() == projectId) {
//                AppDataLoader.projects.remove(currentProject);
//
//            }
//        }
//    }
//
//    public List<User> getProjectUsers(Project project) {
//        return null;
//    }

    public void add(Project project) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Project get(Integer id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void update(Project project) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void delete(Project project) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<Project> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

package ro.sdl.repository;

import ro.sdl.domain.*;

import java.util.Collection;
import java.util.List;

public interface ProjectRepository {


    void add(Project project);
    
    Project get(Integer id);

    void update(Project project);

    void delete(Project project);
    
    Collection<Project> getAll();

}

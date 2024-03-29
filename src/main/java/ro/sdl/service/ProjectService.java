package ro.sdl.service;

import ro.sdl.domain.Project;
import ro.sdl.domain.User;
import ro.sdl.dto.ProjectDetailedDistributionDTO;
import ro.sdl.dto.ProjectDistributionDTO;
import ro.sdl.repository.RepositoryException;

import java.util.List;

public interface ProjectService {

    public void add(Project project);

    public void update(Project project);

    public void delete(Project project);

    public Project get(Integer id);

    public List<Project> getAll();

    public Boolean removeUserFromProject(Project project, User user);

    public ProjectDistributionDTO getProjectDistribution(Project project);

    public ProjectDetailedDistributionDTO getProjectDetailedDistribution(Project project);

    public ProjectDetailedDistributionDTO getProjectDetailedDistribution() throws RepositoryException;

    public List<Project> listProjectWithRole(int value) throws RepositoryException;

    public List<Project> listProjectWithState(int value);

    public List<User> getProjectComposition(Project project);
}

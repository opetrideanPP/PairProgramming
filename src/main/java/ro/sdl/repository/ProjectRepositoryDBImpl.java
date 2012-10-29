package ro.sdl.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sdl.domain.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

/**
 * User: Ovidiu Petridean <opetridean@sdl.com>
 * Date: 15.10.2012
 */
@Repository
@Transactional
public class ProjectRepositoryDBImpl implements ProjectRepository {

    @PersistenceContext
    private EntityManager em;


    public Collection<Project> getAll() {
        List<Project> projectList = em.createQuery("select p from Project p", Project.class).getResultList();
        return projectList;
    }

    public void add(Project project) {
        em.persist(project);
    }

    public Project get(Integer id) {
        return em.find(Project.class, id);
    }

    public void update(Project project) {
        em.merge(project);
    }

    public void delete(Project project) {
        em.remove(project);
    }

}

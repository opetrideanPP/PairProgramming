package ro.sdl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.sdl.domain.Project;
import ro.sdl.domain.Role;
import ro.sdl.domain.State;
import ro.sdl.domain.User;
import ro.sdl.service.ProjectServiceImpl;
import ro.sdl.service.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ProjectServiceImpl projectServiceImpl = (ProjectServiceImpl) new ClassPathXmlApplicationContext("repository-context.xml").getBean("projectServiceImpl");
        UserServiceImpl userService = (UserServiceImpl) new ClassPathXmlApplicationContext("repository-context.xml").getBean("userServiceImpl");

        Project project = new Project();
        project.setDescription("proj desc");
        projectServiceImpl.add(project);
        System.out.println(projectServiceImpl.getAll());
        project = projectServiceImpl.get(1);
        System.out.println(project);

        User user = new User();
        user.setName("Name");
        user.setRole(Role.DEV);
        user.setState(State.MID);
        Set<Project> projectSet = new HashSet<Project>();
        projectSet.add(project);
        user.setProjects(projectSet);
        userService.add(user);
        
        System.out.println(userService.getAll());


//            projectRepositoryDB.add(project);
//            System.out.println(projectRepositoryDB.getProjects());
        /*

        PdfTableGeneratorService pdfTableGeneratorService = new PdfTableGeneratorService();
        pdfTableGeneratorService.generatePdfFile();
        pdfTableGeneratorService.generatePdfFileWithProjectComposition();
        pdfTableGeneratorService.generatePdfFileWithProjectDistribution();
        pdfTableGeneratorService.generatePdfFileWithProjectStateDistribution();
        pdfTableGeneratorService.generatePdfFileWithStructureDistribution();
        pdfTableGeneratorService.generatePdfFileWithRoleRatio();
        */

    }
}

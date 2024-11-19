package crud;

import crud.config.AppConfig;
import crud.model.User;
import crud.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        // Add users and cars
        //userService.addUser(new User("User1", (byte) 67, "user1@mail.ru"));
        //userService.addUser(new User("User2", (byte) 17, "user2@mail.ru"));

        //userService.editUser(new User(2L, "User", (byte) 7, "user@mail.ru"));


        // Check
        List<User> usersToCheck = userService.listUsers();
        for (User user : usersToCheck) {
            System.out.println("Id = " + user.getId());
            System.out.println("Name = " + user.getName());
            System.out.println("Age = " + user.getAge());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }

        context.close();
    }
}

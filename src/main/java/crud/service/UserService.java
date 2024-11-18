package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> listUsers();

    User editUser(User user);
}

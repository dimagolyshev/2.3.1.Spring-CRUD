package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> listUsers();

    User editUser(User user);
}

package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    void addUser(User user, Set<Role> roles);

    List<User> getAllUsers();

    void deleteUser(long id);

    User getUser (long id);

    //User findByUsername(String username);
    Set<Role> getAllRoles();
}

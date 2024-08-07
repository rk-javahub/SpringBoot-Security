/**
 *
 */
package com.rkjavahub.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rkjavahub.model.User;

/**
 * @author Rohit
 *
 */
@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("Rohit", "abc"));
        users.add(new User("Sachin", "xyz"));
    }

    public List<User> getAllUser() {
        return users;
    }

    public User getUser(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public List<User> addUser(User user) {
        users.add(new User(user.getUsername(), user.getPassword()));
        return getAllUser();
    }

}

/**
 * 
 */
package com.rkjavahub.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkjavahub.model.User;
import com.rkjavahub.services.UserService;

/**
 * @author Rohit
 *
 */

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/home")
	public void homepage() {
		System.out.print("Home page");
	}

	@GetMapping(value = "/")
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}

	@GetMapping(value = "/user/{userName}")
	public User getUser(@PathVariable(value = "userName") String userName) {
		return userService.getUser(userName);
	}

	@PostMapping(value = "/addUser")
	public List<User> addUser(@RequestBody User user) {
		return userService.addUser(user);

	}

}

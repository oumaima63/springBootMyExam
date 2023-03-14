package com.esprit.OumaimaOuni.Controllers;

import com.esprit.OumaimaOuni.Services.UserService;
import com.esprit.OumaimaOuni.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // http://localhost:8080/exam/user/retrieve-all-users
    @GetMapping("/retrieve-all-users")
    public List<User> retrieveAllUsers() {
        List<User> listUsers = userService.retrieveAllUsers();
        return listUsers;
    }

    // http://localhost:8080/exam/user/retrieve-One-user/{idUser}
    @GetMapping("/retrieve-One-user/{idUser}")
    public User retrieveUser(@PathVariable("idUser") Integer idUser) {
        return userService.retrieveOneUser(idUser);
    }

    // http://localhost:8080/exam/user/add-user
    @PostMapping("/add-user")
    public User addUser(@RequestBody User u) {
        User user = userService.addUser(u);
        return user;
    }

    // http://localhost:8080/exam/user/remove-user/1
    @DeleteMapping("/remove-user/{idUser}")
    public void deleteUser(@PathVariable("idUser") Integer idUser) {
        userService.deleteUser(idUser);
    }

   // http://localhost:8080/exam/user/update-user
    @PutMapping("/update-user")
    public User updateUser(@RequestBody User u) {
        User user= userService.updateUser(u);
        return user;
    }

}
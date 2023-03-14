package com.esprit.OumaimaOuni.Services;

import com.esprit.OumaimaOuni.entities.User;

import java.util.List;

public interface UserService {
    public List<User> retrieveAllUsers ();

    public User retrieveOneUser(Integer idUser);

    public void deleteUser(Integer idUser);

    public User updateUser(User u);

    public User addUser(User u);
}

package com.esprit.OumaimaOuni.Services;

import com.esprit.OumaimaOuni.Repositories.UserRepository;
import com.esprit.OumaimaOuni.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    public List<User> retrieveAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    public User retrieveOneUser(Integer idUser){
        return (User) userRepository.findById(idUser).get();
    }

    public void deleteUser(Integer idUser){
        User u = retrieveOneUser(idUser);
         userRepository.delete(u);
    }

    public User updateUser(User u){
        return userRepository.save(u);
    }

    public User addUser(User u){
       return userRepository.save(u);
    }


    }



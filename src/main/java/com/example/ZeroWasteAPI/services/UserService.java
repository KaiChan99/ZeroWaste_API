package com.example.ZeroWasteAPI.services;

import com.example.ZeroWasteAPI.models.User;
import com.example.ZeroWasteAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user){
        userRepository.save(user);
        return user;
    }

    public User getUserById(long id){
        return userRepository.findById(id).get();
    }

//
//    public static void deleteUser(Long id){
//        userRepository.deleteById(id);
//    }
//


}

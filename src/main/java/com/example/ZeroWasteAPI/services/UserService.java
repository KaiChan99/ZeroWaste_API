package com.example.ZeroWasteAPI.services;

import com.example.ZeroWasteAPI.models.Ingredient;
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

    public User updateUser(User user, Long id) {
        //Find recipe, add by id
        User userToUpdate = userRepository.findById(id).get();
        //Take each property and update it
        userToUpdate.setName(user.getName());

        //Save recipe to database

        //Return the recipe

        userRepository.save(userToUpdate);
        return userToUpdate;
    }

    //DELETE recipe
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}

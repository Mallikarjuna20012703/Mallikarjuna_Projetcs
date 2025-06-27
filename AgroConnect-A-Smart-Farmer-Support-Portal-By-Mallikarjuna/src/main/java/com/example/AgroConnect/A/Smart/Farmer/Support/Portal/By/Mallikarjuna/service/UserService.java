package com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.service;




import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.model.User;
import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //  Create user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Find by username
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    //  Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    //  Check if username exists
    public boolean usernameExists(String username) {
        return userRepository.existsByUsername(username);
    }
}

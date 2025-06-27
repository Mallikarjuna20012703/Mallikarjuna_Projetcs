package com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.controller;

import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.model.Role;
import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.model.User;
import com.example.AgroConnect.A.Smart.Farmer.Support.Portal.By.Mallikarjuna.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //  Show Registration Form
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roles", Role.values()); // To show dropdown of roles
        return "register";
    }

    //  Handle Form Submission
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, Model model) {
        if (userService.usernameExists(user.getUsername())) {
            model.addAttribute("error", "Username already exists!");
            model.addAttribute("roles", Role.values());
            return "register";
        }

        userService.saveUser(user);
        return "redirect:/users/success";
    }

    //  Success Page
    @GetMapping("/success")
    public String registrationSuccess() {
        return "success";
    }
}

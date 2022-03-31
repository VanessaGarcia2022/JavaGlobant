package com.vanessadev.topic5.controller;

import com.vanessadev.topic5.entity.User;
import com.vanessadev.topic5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired //inyección de dependencia
    UserRepository repo;

    @GetMapping("/createUser")
    public ResponseEntity doShowUsers (){

    }

    @PostMapping("/createUser")
    public ResponseEntity doCreateUser (@RequestBody User user){

        repo.save(user);
        return new ResponseEntity("User "+ user.getName() + "was create successfully", HttpStatus.OK);

//        repo.save(user); //INSERT INTO user (...) VALUE(...)
//        model.addAttribute("user", new User());
//        model.addAttribute("users", repo.findAll());
//        return "index";
    }

    @PutMapping("/editUser/{id}") //pasar variable por URL
    public String editUserForm(Model model, @PathVariable(name="id") Long id){
        //Optional<User> userToEdit = repo.findById(id); // retorna un objeto tipo opcional
        User userToEdit = repo.findById(id).get();
        model.addAttribute("user", userToEdit);
        model.addAttribute("users", repo.findAll());

        return "index";
    }

}

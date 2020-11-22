package tech.technote.delmore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.technote.delmore.repositories.UsersRepository;
import tech.technote.delmore.entity.Users;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping("/hello")
    public String world() {
        return "hello world";
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public Users findById(@PathVariable int id) {
        return usersRepository.findById(id).get();
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public Users saveUser(@ModelAttribute Users usersEntity) {
        return usersRepository.save(usersEntity);
    }

    @RequestMapping(value = "users", method = RequestMethod.PUT)
    public Users updateUser(Users usersEntity) {
        return usersRepository.saveAndFlush(usersEntity);
    }
}

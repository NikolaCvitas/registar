package hr.nikola.registar.controller;

import hr.nikola.registar.entity.User;
import hr.nikola.registar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService p_userService) {
        userService = p_userService;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable int id) {

        return userService.findById(id);
    }

    @PostMapping("/users")
    public void save(@RequestBody User user) {

          userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable int id) throws Exception {

        User tempUser = userService.findById(id);

        if (tempUser == null) {
            throw new Exception("User id not found - " + id);
        }

        userService.deleteById(id);
    }

}

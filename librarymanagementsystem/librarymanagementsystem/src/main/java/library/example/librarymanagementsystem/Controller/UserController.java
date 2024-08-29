package library.example.librarymanagementsystem.Controller;

import library.example.librarymanagementsystem.Models.User;
import library.example.librarymanagementsystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping
    public List<User>findAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/userId")
    public Optional<User>findUserById(@RequestParam Integer userId){
        return userService.getUserById(userId);

    }
    @GetMapping("/userName")
    public Optional<User>findUserByName(@RequestParam String userName){
        return userService.getUserByName(userName);
    }
    @GetMapping("/phone")
    public Optional<User>findUserByPhone(@RequestParam String userPhone){
        return userService.getUserByPhone(userPhone);
    }
    @PutMapping
    public User changeUser(@RequestBody User editUser) {
        return userService.updateUser(editUser);
    }
    @DeleteMapping("/{userId}")
    public String removeUser(@PathVariable Integer userId) {
        return userService.deleteUser(userId);
    }




}

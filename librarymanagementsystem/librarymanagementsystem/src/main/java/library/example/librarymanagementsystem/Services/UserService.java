package library.example.librarymanagementsystem.Services;

import library.example.librarymanagementsystem.Models.User;
import library.example.librarymanagementsystem.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User addUser(User user){
        return userRepo.save(user);
    }
    public List<User>getAllUser(){
        return userRepo.findAll();
    }
    public Optional<User>getUserById(Integer userId){
        return userRepo.findById(userId);
    }
    public Optional<User>getUserByName(String userName){
        return userRepo.findByUserName(userName);
    }
    public  Optional<User>getUserByPhone(String userPhone){
        return userRepo.findByUserPhone(userPhone);
    }
    public User updateUser(User updatedUser) {
        User existingUser = userRepo.findById(updatedUser.getUserId()).get();
        existingUser.setUserName(updatedUser.getUserName());
        existingUser.setUserPhone(updatedUser.getUserPhone());
        existingUser.setUserAddress(updatedUser.getUserAddress());
        return userRepo.save(existingUser);
    }

    public String deleteUser(Integer userId) {
        userRepo.deleteById(userId);
        return "User Deleted Successfully";
    }


}

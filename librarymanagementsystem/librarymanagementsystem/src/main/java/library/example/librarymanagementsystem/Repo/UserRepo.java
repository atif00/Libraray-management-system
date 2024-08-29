package library.example.librarymanagementsystem.Repo;
import library.example.librarymanagementsystem.Models.Book;
import library.example.librarymanagementsystem.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User,Integer> {
 @Query("{'userName': ?0}")
    Optional<User>findByUserName(String userName);
 @Query("{'userPhone':?0}")
    Optional<User>findByUserPhone(String userPhone);
}

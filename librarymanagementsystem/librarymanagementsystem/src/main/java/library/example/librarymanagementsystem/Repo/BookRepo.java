package library.example.librarymanagementsystem.Repo;

import library.example.librarymanagementsystem.Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository<Book,Integer> {
    @Query("{ 'bookName': ?0}")
    Optional<Book> findByName(String bookName);
    @Query("{'bookAuthor':?0}")
    Optional<Book>findByAuthor(String bookAuthor);
    @Query("{'bookStatus':true}")
    List<Book>findByAvailability();

}

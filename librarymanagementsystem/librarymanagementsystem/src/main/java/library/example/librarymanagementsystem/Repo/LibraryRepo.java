package library.example.librarymanagementsystem.Repo;

import library.example.librarymanagementsystem.Models.BookLibrary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepo extends MongoRepository<BookLibrary,Integer> {
    @Query("{'libName':?0}")
    Optional<BookLibrary> findByLibName(String libName);
}


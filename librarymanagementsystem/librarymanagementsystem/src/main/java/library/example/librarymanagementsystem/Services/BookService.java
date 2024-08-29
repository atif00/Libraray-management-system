package library.example.librarymanagementsystem.Services;

import library.example.librarymanagementsystem.Models.Book;
import library.example.librarymanagementsystem.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book){
        return bookRepo.save(book);
    }
   public List<Book>getAllBooks(){
       return bookRepo.findAll();
    }
    public Optional<Book>getBookById(Integer bookId){
        return bookRepo.findById(bookId);
    }
   public Optional<Book>getBookByName(String bookName){
        return bookRepo.findByName(bookName);
   }
   public Optional<Book>getBookByAuthor(String bookAuthor){
        return bookRepo.findByAuthor(bookAuthor);
   }

//    public Book updateBook(Book updatedBook) {
//        AtomicReference<Book> atomicReference=new AtomicReference<>();
//        Optional<Book> existingBook=bookRepo.findById(updatedBook.getBookId());
//        existingBook.ifPresentOrElse(checker-> checker.setName());
//    }

    public String deleteBook(Integer bookId){
         bookRepo.deleteById(bookId);
         return "book deleted successfully";
    }
    public List<Book>getBookByAvailability(){
        return bookRepo.findByAvailability();
    }
    public Book updateBook(Book updatedBook) {
        Book existingBook = bookRepo.findById(updatedBook.getBookId()).get();
        existingBook.setBookStatus(updatedBook.isBookStatus());
        return bookRepo.save(existingBook);
    }




}

package library.example.librarymanagementsystem.Controller;

import library.example.librarymanagementsystem.Models.Book;
import library.example.librarymanagementsystem.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
//    @Autowired
//    private UserService userService;

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
   @GetMapping
    public List<Book>findAllBooks(){
       return bookService.getAllBooks();
    }
    @GetMapping("/{bookId}")
    public Optional<Book>findBookById(@PathVariable Integer bookId){
        return bookService.getBookById(bookId);
   }
    @GetMapping("/name")
    public Optional<Book>findBookByName(@RequestParam String bookName){
        return bookService.getBookByName(bookName);
    }
    @GetMapping("/author")
    public Optional<Book>findBookByAuthor(@RequestParam String bookAuthor){
        return bookService.getBookByAuthor(bookAuthor);
    }
   @PutMapping
    public Book changeBook(@RequestBody Book book){
       return bookService.updateBook(book);
   }
   @DeleteMapping("/{bookId}")
   public String removeBook(@PathVariable Integer bookId){
        return bookService.deleteBook(bookId);
   }

    @GetMapping("/available")
    public List<Book>availableBook(){
        return bookService.getBookByAvailability();
   }
//
//    @GetMapping("/fee")
//    public int calculateFee(@RequestParam String bookIssueDate, @RequestParam
//    String bookReturnDate, @RequestParam int numberOfBooksTaken) {
//        return bookService.feeCalculation(bookIssueDate, bookReturnDate, numberOfBooksTaken);
//    }




}

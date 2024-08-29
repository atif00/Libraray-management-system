package library.example.librarymanagementsystem.Controller;

import library.example.librarymanagementsystem.Models.BookLibrary;
import library.example.librarymanagementsystem.Services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @PostMapping()
    public BookLibrary createLibrary(@RequestBody BookLibrary library){
        return libraryService.addLibrary(library);
    }
    @GetMapping
    public List<BookLibrary>findLibraryData(){
        return libraryService.getLibrary();
    }
  @GetMapping("/id")
    public Optional<BookLibrary>findLibraryById(@RequestParam Integer libId){
        return libraryService.getLibraryById(libId);
  }
  @GetMapping("/name")
    public Optional<BookLibrary>findLibraryByName(@RequestParam String libName){
        return libraryService.getLibraryByName(libName);
  }
  @DeleteMapping
    public String deleteLibItem(@RequestParam Integer libId){
        return libraryService.deleteLib(libId);
  }
    @PutMapping
    public BookLibrary updateLibrary(@RequestBody BookLibrary library) {
        return libraryService.updateLibraryDetails(library);
    }


}

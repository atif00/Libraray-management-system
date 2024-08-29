package library.example.librarymanagementsystem.Services;


import library.example.librarymanagementsystem.Models.BookLibrary;
import library.example.librarymanagementsystem.Repo.LibraryRepo;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepo libraryRepo;

    public BookLibrary addLibrary(BookLibrary library){
        return libraryRepo.save(library);
    }
    public List<BookLibrary>getLibrary(){
        return libraryRepo.findAll();
    }
   public Optional<BookLibrary>getLibraryById(Integer libId){
        return libraryRepo.findById(libId);
   }
    public Optional<BookLibrary>getLibraryByName(String libName){
        return libraryRepo.findByLibName(libName);
    }
    public String deleteLib(Integer libId){
        libraryRepo.deleteById(libId);
        return "deleted suceesfully libraray";
    }

    public BookLibrary updateLibraryDetails(BookLibrary updatedLibrary) {
        BookLibrary existingLibrary = libraryRepo.findById(updatedLibrary.getLibId()).get();
        existingLibrary.setLibName(updatedLibrary.getLibName());
        existingLibrary.setLibAddress(updatedLibrary.getLibAddress());
        existingLibrary.setLibPhone(updatedLibrary.getLibPhone());
        return libraryRepo.save(existingLibrary);
    }


}

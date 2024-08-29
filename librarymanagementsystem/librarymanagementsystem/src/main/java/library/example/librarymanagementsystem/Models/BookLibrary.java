package library.example.librarymanagementsystem.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BookLibrary {
    @Id
    private int libId;
    private String libName;
    private String libAddress;
    private  String libPhone;
    private int bookId;
}

package library.example.librarymanagementsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class User {
   @Id
    private int userId;
    private String userName;
    private String userAddress;
    private String userPhone;
    private int numberOfBooksTaken;
    private int lateFee;

}

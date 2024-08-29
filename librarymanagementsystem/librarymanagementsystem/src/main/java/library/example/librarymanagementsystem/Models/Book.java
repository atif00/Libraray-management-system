package library.example.librarymanagementsystem.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class Book {
    @Id
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private boolean bookStatus;
    private String bookIssueDate;
    private String bookReturnDate;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookIssueDate() {
        return bookIssueDate;
    }

    public void setBookIssueDate(String bookIssueDate) {
        this.bookIssueDate = bookIssueDate;
    }

    public String getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(String bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
}

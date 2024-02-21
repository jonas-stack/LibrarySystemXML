package BLL;

import BE.Book;
import DAL.DOM_Parsing_Books;
import java.util.List;

public class LibrarySystemManager {

    private final DOM_Parsing_Books domParsingBooks;

    public LibrarySystemManager(String filePath) {
        this.domParsingBooks = new DOM_Parsing_Books(filePath);
    }

    public List<Book> getBooks() {
        // Parse books using DAL
        List<Book> books = domParsingBooks.parseBooks();

        // Additional business logic operations can be performed here if needed

        return books;
    }

    // Additional methods for business logic operations can be added here
}

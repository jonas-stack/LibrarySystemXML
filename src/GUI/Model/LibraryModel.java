package GUI.Model;

import BE.Book;
import BLL.LibrarySystemManager;

import java.util.List;

public class LibraryModel {

    private final LibrarySystemManager librarySystemManager;

    public LibraryModel(String filePath) {
        this.librarySystemManager = new LibrarySystemManager(filePath);
    }

    public List<Book> getBooks() {
        return librarySystemManager.getBooks();
    }

    // Additional methods for interacting with the Manager can be added here
}

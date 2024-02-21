package GUI.Controller;

import BLL.LibrarySystemManager;
import BE.Book;
import GUI.Model.LibraryModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import java.util.List;

public class LibraryInventory {
    @FXML
    private ListView<Book> libraryListView;

    private final LibrarySystemManager librarySystemManager = new LibrarySystemManager();
    private final LibraryModel libraryModel = new LibraryModel(); // Instantiate the model

    // This method is typically called when the FXML is loaded
    public void initialize() {
        // 1. Process books and update model
        List<Book> books = librarySystemManager.processBooks("Resources/Data/Books.XML");
        // 2. Update the library model with the parsed books
        libraryModel.updateLibraryView(books);
        // 3. Bind model to ListView
        libraryModel.bindToListView(libraryListView);
    }
}

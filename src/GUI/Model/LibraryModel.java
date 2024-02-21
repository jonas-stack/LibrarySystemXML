package GUI.Model;

import BE.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.List;

public class LibraryModel {
    private final ObservableList<Book> books = FXCollections.observableArrayList();

    public void updateLibraryView(List<Book> bookList) {
        // Clear the existing list and add the new books
        books.clear();
        books.addAll(bookList);
    }

    public void bindToListView(ListView<Book> listView) {
        listView.setItems(books);
    }
}

package GUI.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import BE.Book;
import GUI.Model.LibraryModel;
import java.util.List;

public class LibraryInventoryController {

    @FXML
    private TableColumn<Book, Integer> coloumnID;
    @FXML
    private TableColumn<Book, String> coloumnTitle;
    @FXML
    private TableColumn<Book, String> coloumnWriter;
    @FXML
    private TableColumn<Book, Double> coloumnLIX;
    @FXML
    private TableColumn<Book, Integer> coloumnPages;
    @FXML
    private TableColumn<Book, Integer> coloumnTimesLent;
    @FXML
    private TableView<Book> tblLibraryBooks;

    private final LibraryModel libraryModel;

    public LibraryInventoryController() {
        this.libraryModel = new LibraryModel("Resources/Data/Books.XML");
    }

    @FXML
    public void initialize() {
        populateTableView();
    }

    private void populateTableView() {
        List<Book> books = libraryModel.getBooks();
        tblLibraryBooks.getItems().addAll(books);

        coloumnID.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        coloumnTitle.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        coloumnWriter.setCellValueFactory(cellData -> cellData.getValue().writerProperty());
        coloumnLIX.setCellValueFactory(cellData -> cellData.getValue().lixProperty().asObject());
        coloumnPages.setCellValueFactory(cellData -> cellData.getValue().pagesProperty().asObject());
        coloumnTimesLent.setCellValueFactory(cellData -> cellData.getValue().timesLendedProperty().asObject());
    }
}

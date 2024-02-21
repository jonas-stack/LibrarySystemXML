package BLL;

import BE.Book;
import DAL.DOM_Parsing_Books;
import GUI.Model.LibraryModel;

import java.util.List;

public class LibrarySystemManager {

    private final DOM_Parsing_Books domParsing = new DOM_Parsing_Books();

    public List<Book> processBooks(String filePath) {
        // 1. Parse the XML file and retrieve book information
        return domParsing.parseXML(filePath);
    }
}

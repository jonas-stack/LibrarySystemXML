package DAL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import BE.Book;
import java.util.ArrayList;
import java.util.List;

public class DOM_Parsing_Books {

    private String filePath;

    public DOM_Parsing_Books(String filePath) {
        this.filePath = filePath;
    }

    public List<Book> parseBooks() {
        List<Book> books = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(filePath);

            NodeList bookList = document.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Element bookElement = (Element) bookList.item(i);
                Book book = parseBook(bookElement);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    private Book parseBook(Element bookElement) {
        int id = getIntValue(bookElement, "id");
        String title = getTextValue(bookElement, "title");
        String writer = getTextValue(bookElement, "writer");
        double lix = getDoubleValue(bookElement, "lix");
        int pages = getIntValue(bookElement, "pages");
        int timesLended = getIntValue(bookElement, "times_lended");
        return new Book(id, title, writer, lix, pages, timesLended);
    }

    private int getIntValue(Element parentElement, String tagName) {
        return Integer.parseInt(getTextValue(parentElement, tagName));
    }

    private double getDoubleValue(Element parentElement, String tagName) {
        return Double.parseDouble(getTextValue(parentElement, tagName));
    }

    private String getTextValue(Element parentElement, String tagName) {
        return parentElement.getElementsByTagName(tagName).item(0).getTextContent();
    }
}

package DAL;

import BE.Book;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM_Parsing_Books {
    private static final String XML_FILE_PATH = "Resources/Data/Books.XML";
    public List<Book> parseXML(String filePath) {
        List<Book> books = new ArrayList<>();

        try {
            // Obtain a parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            File file = new File(XML_FILE_PATH);
            Document document = builder.parse(file);

            // Navigate and extract data
            NodeList bookNodes = document.getElementsByTagName("book");
            for (int i = 0; i < bookNodes.getLength(); i++) {
                Element bookElement = (Element) bookNodes.item(i);
                String id = bookElement.getElementsByTagName("id").item(0).getTextContent();
                String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                String writer = bookElement.getElementsByTagName("writer").item(0).getTextContent();
                String lix = bookElement.getElementsByTagName("lix").item(0).getTextContent();
                String pages = bookElement.getElementsByTagName("pages").item(0).getTextContent();
                String timesLent = bookElement.getElementsByTagName("times_lended").item(0).getTextContent();

                // Create Book object and add to the list
                Book book = new Book(id, title, writer, lix, pages, timesLent);
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }
}

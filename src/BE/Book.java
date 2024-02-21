package BE;

import javafx.beans.property.*;

/**
 * Represents a book entity with properties for each attribute.
 * JavaFX properties are used instead of traditional getters and setters for the following reasons:
 * 1. Observable Properties: JavaFX properties are observable, allowing listeners to be registered
 *    for notifications when their values change. This is useful for updating UI components in real time.
 * 2. Binding: JavaFX properties support binding, enabling automatic synchronization between properties.
 *    This simplifies UI development and reduces the risk of inconsistencies in the application's state.
 * 3. Automatic Updates: Modifications to JavaFX properties trigger automatic updates to bound properties
 *    and listeners, eliminating the need for manual propagation of changes.
 * 4. Integration with JavaFX Controls: JavaFX properties seamlessly integrate with JavaFX UI controls,
 *    facilitating direct binding of properties to UI elements such as text fields, labels, and tables.
 */

public class Book {
    // Properties for each attribute
    private final IntegerProperty id;
    private final StringProperty title;
    private final StringProperty writer;
    private final DoubleProperty lix;
    private final IntegerProperty pages;
    private final IntegerProperty timesLended;

    // Constructor and property accessor methods omitted for brevity
    public Book(int id, String title, String writer, double lix, int pages, int timesLended) {
        this.id = new SimpleIntegerProperty(id);
        this.title = new SimpleStringProperty(title);
        this.writer = new SimpleStringProperty(writer);
        this.lix = new SimpleDoubleProperty(lix);
        this.pages = new SimpleIntegerProperty(pages);
        this.timesLended = new SimpleIntegerProperty(timesLended);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty titleProperty() {
        return title;
    }

    public StringProperty writerProperty() {
        return writer;
    }

    public DoubleProperty lixProperty() {
        return lix;
    }

    public IntegerProperty pagesProperty() {
        return pages;
    }

    public IntegerProperty timesLendedProperty() {
        return timesLended;
    }

    // Getters and setters (if needed) for non-property fields
    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    // Repeat for other fields
}

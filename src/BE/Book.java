package BE;

public class Book {
    private String id;
    private String title;
    private String writer;
    private String lix;
    private String pages;
    private String timesLent;

    // Constructor
    public Book(String id, String title, String writer, String lix, String pages, String timesLent) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.lix = lix;
        this.pages = pages;
        this.timesLent = timesLent;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getLix() {
        return lix;
    }

    public void setLix(String lix) {
        this.lix = lix;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getTimesLent() {
        return timesLent;
    }

    public void setTimesLent(String timesLent) {
        this.timesLent = timesLent;
    }

    // Override toString method for debugging or printing
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", lix='" + lix + '\'' +
                ", pages='" + pages + '\'' +
                ", timesLent='" + timesLent + '\'' +
                '}';
    }
}

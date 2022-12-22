package task7;

public class Book {
    private String name, author;
    private int edition, publishYear;

    public Book(String name, String author, int edition, int publishYear) {
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.publishYear = publishYear;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        String res = "Book: name - " + name + ", author - " + author + ", edition - " + edition + ", publishYear - " + publishYear;
        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return publishYear;
    }
}

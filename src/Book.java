public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;
    public static int bookCounter = 0;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
        bookCounter++;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}


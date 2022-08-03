import java.util.Objects;

public class Library {
    private Book[] book;

    public Library(int arrayMaximumSize) {
        this.book = new Book[arrayMaximumSize];
    }

    public void printLibrary() {
        for (int i = 0; i < Book.bookCounter; i++) {
            System.out.println(this.book[i].getAuthor() + " : " + this.book[i].getBookName() + " : " + this.book[i].getPublicationYear());
        }
    }

    public void addBookToLibrary(String bookName, Author author, int publicationYear) {
        this.book[Book.bookCounter] = new Book(bookName, author, publicationYear);
    }

    public void printBookInfoByName(String name) {
        for (int i = 0; i < Book.bookCounter; i++) {
            if (this.book[i].getBookName().equals(name)) {
                System.out.printf("%s by %s was published in %d\n", this.book[i].getBookName(), this.book[i].getAuthor(), this.book[i].getPublicationYear());
                break;
            }
        }
    }

    public void changePublicationYear(String name, int newYear) {
        for (int i = 0; i < Book.bookCounter; i++) {
            if (this.book[i].getBookName().equals(name)) {
                this.book[i].setPublicationYear(newYear);
                break;
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen", "King");
        Author hermannHesse = new Author("Hermann", "Hesse");
        Author franzKafka = new Author("Franz", "Kafka");


        int arrayMaximumSize = 5;

        Book[] booksArr = new Book[arrayMaximumSize];

        addBookToArray("Misery", stephenKing, 1987, booksArr);
        addBookToArray("The Green Mile", stephenKing, 1996, booksArr);
        addBookToArray("Das Glasperlenspiel", hermannHesse, 1943, booksArr);
        addBookToArray("Der Steppenwolf", hermannHesse, 1927, booksArr);
        addBookToArray("Der Process", franzKafka, 1925, booksArr);

        for (int i = 0; i < Book.bookCounter; i++) {
            printBookInfo(booksArr[i]);
        }

    }

    public static void printBookInfo(Book book) {
        System.out.println(book.getAuthor() + " : " + book.getBookName() + " : " + book.getPublicationYear());
    }

    public static void addBookToArray(String bookName, Author author, int publicationYear, Book[] booksArr) {
        Book book = new Book(bookName, author, publicationYear);
        booksArr[Book.bookCounter - 1] = book;

    }
}
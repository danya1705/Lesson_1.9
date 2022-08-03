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

        printArray(booksArr);
    }

    public static void printArray(Book[] book) {
        for (int i = 0; i < Book.bookCounter; i++) {
            System.out.println(book[i].getAuthor() + " : " + book[i].getBookName() + " : " + book[i].getPublicationYear());
        }
    }

    public static void addBookToArray(String bookName, Author author, int publicationYear, Book[] booksArr) {
        booksArr[Book.bookCounter] = new Book(bookName, author, publicationYear);
    }
}
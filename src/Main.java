public class Main {
    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen", "King");
        Author hermannHesse = new Author("Hermann", "Hesse");
        Author franzKafka = new Author("Franz", "Kafka");

        int arrayMaximumSize = 5;

        Library lib = new Library(arrayMaximumSize);

        lib.addBookToLibrary("Misery", stephenKing, 1987);
        lib.addBookToLibrary("The Green Mile", stephenKing, 1996);
        lib.addBookToLibrary("Das Glasperlenspiel", hermannHesse, 1943);
        lib.addBookToLibrary("Der Steppenwolf", hermannHesse, 1927);
        lib.addBookToLibrary("Der Process", franzKafka, 1925);

        lib.printLibrary();

        lib.printBookInfoByName("Der Steppenwolf");

        lib.changePublicationYear("Misery", 2000);

        lib.printLibrary();

    }


}
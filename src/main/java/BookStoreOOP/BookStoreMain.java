package BookStoreOOP;

public class BookStoreMain {
    public static void main(String[] args) {

//        Book book1 = new Book("Harry Potter", "Joan Rowling", 1, 15.33, true);
//        Book book2 = new Book("Anna Karenina", "L. Tolstoy", 2, 20, true);

        AudioBook book1 = new AudioBook("Harry Potter", "Joan Rowling", 1, 15.33, true, "mp3", 256, "Masha");
        EBook book2 = new EBook("Anna Karenina", "L. Tolstoy", 2, 20, true, "www.bookstore.com/AnnaKarenina");
        PrintedBook book3 = new PrintedBook("Some book", "Some author", 3, 9, true, 100);


        book1.setAvailable(true);
        book2.setPriceUSD(25);

        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();
    }
}

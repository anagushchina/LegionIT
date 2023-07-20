package lesson1;

public class Book {
    //describe a book, create all the variables we need
    //book should have name, author, id, price in USD, availability
    //using conversion rate calculate the price in EUR and RUB
    //print all the book details including both prices

    String euro = "EUR";
    String rubles = "RUB";

    public static void main(String[] args) {

        Book Book = new Book();
        Book.createNewBook("Harry Potter", "Joan Rowling", 1, 15.33, false);


    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable){

        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRUB = calculatePrice(priceInUSD, rubles);



        System.out.println("Book name is " + bookName);
        System.out.println("Author name is " + authorName);
        System.out.println("Book id " + id);
        System.out.println("Book price is " + priceInUSD + " USD or " + priceInEUR + " EUR or " + priceInRUB + " RUB");
        System.out.println("Book is available: " + isAvailable);

    }

    public double calculatePrice(double priceInUSD, String currency){
        double rate = 1;
        if(currency.equals(euro)){
            rate = 1.1;
        }
        else if(currency.equals(rubles)){
            rate = 70;
        }
        else{
            System.out.println("error: unknown currency, the price is returned in USD");
        }
        double priceAfterConversion = priceInUSD*rate;
        return priceAfterConversion;

    }


}

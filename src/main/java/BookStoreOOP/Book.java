package BookStoreOOP;

public abstract class Book {
    String bookName;
    String authorName;
    int id;
    double priceUSD;
    boolean isAvailable;

    String euro = "EUR";
    String rubles = "RUB";

    public Book (String bookNameNew, String authorNameNew, int idNew, double priceUSDNew, boolean isAvailableNew){
        this.bookName=bookNameNew;
        this.authorName=authorNameNew;
        this.id=idNew;
        this.priceUSD=priceUSDNew;
        this.isAvailable=isAvailableNew;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getPriceUSD() {
        return priceUSD;
    }
    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double convertPrice(String currency){
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
        double priceAfterConversion = priceUSD*rate;
        return priceAfterConversion;
    }

    public void printBookInfo(){
        double priceEUR = convertPrice("EUR");
        double priceRUB = convertPrice("RUB");
        System.out.println("***********");
        System.out.println("Book name is " + bookName);
        System.out.println("Author name is " + authorName);
        System.out.println("Book id " + id);
        System.out.println("Book price is " + priceUSD + " USD or " + String.format("%.2f", priceEUR) + " EUR or " + String.format("%.2f", priceRUB) + " RUB");
        System.out.println("Book is available: " + isAvailable);
    }


}

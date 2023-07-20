package BookStoreOOP;

public class PrintedBook extends Book{

    int amountOfPages;

    public int getAmountOfPages() {
        return amountOfPages;
    }
    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public PrintedBook(String bookNameNew, String authorNameNew, int idNew, double priceUSDNew, boolean isAvailableNew, int amountOfPagesNew) {
        super(bookNameNew, authorNameNew, idNew, priceUSDNew, isAvailableNew);
        this.amountOfPages=amountOfPagesNew;
    }


    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Amount of pages: " + amountOfPages);
    }
}

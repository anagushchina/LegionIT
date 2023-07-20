package BookStoreOOP;

public class EBook extends Book{
    String downloadURL;

    public String getDownloadURL() {
        return downloadURL;
    }
    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public EBook(String bookNameNew, String authorNameNew, int idNew, double priceUSDNew, boolean isAvailableNew, String downloadURLNew) {
        super(bookNameNew, authorNameNew, idNew, priceUSDNew, isAvailableNew);
        this.downloadURL=downloadURLNew;
    }


    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.println("Download URL: " + downloadURL);
    }
}

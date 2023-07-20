package BookStoreOOP;

public class AudioBook extends Book{

    String format;
    int bitRate;
    String readerName;



    public AudioBook(String bookNameNew, String authorNameNew, int idNew, double priceUSDNew, boolean isAvailableNew, String formatNew, int bitRateNew, String readerNameNew) {
        super(bookNameNew, authorNameNew, idNew, priceUSDNew, isAvailableNew);
        this.format=formatNew;
        this.bitRate=bitRateNew;
        this.readerName=readerNameNew;
    }

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    public int getBitRate() {
        return bitRate;
    }
    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public String getReaderName() {
        return readerName;
    }
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public void printBookInfo(){
        super.printBookInfo();
        System.out.println(String.format("Book format is %s", format));
        System.out.println(String.format("Book bitrate is %d", bitRate));
        System.out.println(String.format("Book reader is %s", readerName));
    }

}

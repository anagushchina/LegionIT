package Pages;

public class AboutPage extends Page{

    private String disclaimer;
    public String getDisclaimer() {
        return disclaimer;
    }
    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public void getDeveloperName(){
        System.out.println("Mary Johns");
    }

}

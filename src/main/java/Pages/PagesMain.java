package Pages;

public class PagesMain {
    public static void main(String[] args) {
        Page loginScreen = new Page("Login", 1, "www.qalegion.com/login");
        loginScreen.openPage();
        loginScreen.clickButton("Login");
        loginScreen.closePage();

        Page aboutScreen = new Page();
        aboutScreen.setPageName("About");
        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageId(2);
        aboutScreen.setURL("www.qalegion.com/about");

        aboutScreen.openPage();
        aboutScreen.clickButton("Exit");
        aboutScreen.closePage();

        LoginPage loginPage = new LoginPage();
        loginPage.setPageName("Login page");
        loginPage.setURL("https//...");
        loginPage.openPage();
        loginPage.setUserName("username");
        loginPage.setPassword("qwerty");
        loginPage.populateCredentials();

        Page page = new Page();
        page.getDeveloperName();

        Page loginPage1 = new LoginPage();
        loginPage1.getDeveloperName();

        Page aboutPage = new AboutPage();
        aboutPage.getDeveloperName();



    }


}

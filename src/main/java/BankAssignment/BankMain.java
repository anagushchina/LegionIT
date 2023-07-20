package BankAssignment;

public class BankMain {
    public static void main(String[] args) {

        Manager manager = new Manager("John Doe", 1, "Manager", "1984/07/16", "Toronto");
        manager.printEmpDetails();
        manager.hireEmployee();
        manager.receiveSalary();

        Clerc clerc1 = new Clerc("Ann Lee", 2, "Clerc", "1979/05/22", "Toronto");
        clerc1.printEmpDetails();
        clerc1.answerPhoneCall();
        clerc1.receiveSalary();

        Clerc clerc2 = new Clerc("Lola Hunt", 3, "Clerc", "1990/02/11", "Toronto");
        clerc2.setSalary(4000);
        clerc2.setEmpJobTitle("Senior clerc");
        clerc2.printEmpDetails();
        clerc2.receiveSalary();

        Clerc clerc3 = new Clerc("Kate Moss", 4, "Clerc", "1993/12/08", "Toronto");
        clerc3.printEmpDetails();
        clerc3.callCustomer();
        clerc3.receiveSalary();

        Accountant accountant1 = new Accountant("Nataly Smith", 5,"Accountant", "1994/10/15", "Vaughan");
        accountant1.printEmpDetails();
        accountant1.openAccount();
        accountant1.receiveSalary();

        Accountant accountant2 = new Accountant("Hesham Ahmed", 6,"Accountant", "1976/05/12", "Vaughan");
        accountant2.printEmpDetails();
        accountant2.closeAccount();
        accountant2.receiveSalary();

        Accountant accountant3 = new Accountant("Lisa Crawford", 7,"Accountant", "1991/04/04", "Vaughan");
        accountant3.printEmpDetails();
        accountant3.createReport();
        accountant3.receiveSalary();

        Accountant accountant4 = new Accountant("Peter Parker", 8,"Accountant", "1987/01/23", "Vaughan");
        accountant4.setEmpAddress("Moscow");
        accountant4.printEmpDetails();
        accountant4.receiveSalary();

        Accountant accountant5 = new Accountant("Rick Rick", 9,"Accountant", "1987/02/20", "Vaughan");
        accountant5.printEmpDetails();
        accountant5.receiveSalary();
    }
}

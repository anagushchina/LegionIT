package Bank;

public class Accountant extends Employee {

    public Accountant(String name, int id, String dateOfBirth, String address) {
        super(name, id, Consts.ACCOUNTANT_TYPE, dateOfBirth, address, Consts.ACCOUNTANT_DEFAULT_SALARY);
    }

    public void openAccount() {
        System.out.println(String.format("%s %s opens a new account", Consts.ACCOUNTANT_TYPE, empName));
    }
    public void closeAccount() {
        System.out.println(String.format("%s %s closes an account", Consts.ACCOUNTANT_TYPE, empName));
    }
    public void createReport() {
        System.out.println(String.format("%s %s creates a report", Consts.ACCOUNTANT_TYPE, empName));
    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(Consts.ACCOUNTANT_DEFAULT_SALARY));
    }


}

package Bank;

public class Clerc extends Employee {


    public Clerc(String name, int id, String dateOfBirth, String address) {
        super(name, id, Consts.CLERC_TYPE, dateOfBirth, address, Consts.CLERC_DEFAULT_SALARY);
    }

    public void callCustomer() {
        System.out.println(String.format("%s %s calls a customer", Consts.CLERC_TYPE, empName));
    }
    public void answerPhoneCall() {
        System.out.println(String.format("%s %s answers a phone call", Consts.CLERC_TYPE, empName));
    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(Consts.CLERC_DEFAULT_SALARY));
    }
}

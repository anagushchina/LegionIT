package BankOOP;

public class Clerc extends Employee{

    int salary = 3000;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Clerc(String name, int id, String jobTitle, String dateOfBirth, String address) {
        super(name, id, jobTitle, dateOfBirth, address);
    }

    public void callCustomer() {
        System.out.println(String.format("%s %s calls a customer", empJobTitle, empName));
    }
    public void answerPhoneCall() {
        System.out.println(String.format("%s %s answers a phone call", empJobTitle, empName));
    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(salary));
    }
}

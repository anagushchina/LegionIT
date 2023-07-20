package BankAssignment;

public class Accountant extends Employee{

    int salary = 5000;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Accountant(String name, int id, String jobTitle, String dateOfBirth, String address) {
        super(name, id, jobTitle, dateOfBirth, address);
    }

    public void openAccount() {
        System.out.println(String.format("%s %s opens a new account", empJobTitle, empName));
    }
    public void closeAccount() {
        System.out.println(String.format("%s %s closes an account", empJobTitle, empName));
    }
    public void createReport() {
        System.out.println(String.format("%s %s creates a report", empJobTitle, empName));
    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(salary));
    }


}

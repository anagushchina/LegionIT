package BankAssignment;

public class Manager extends Employee {

    int salary = 10000;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        salary = salary;
    }

    public Manager(String name, int id, String jobTitle, String dateOfBirth, String address) {
        super(name, id, jobTitle, dateOfBirth, address);
    }

    public void hireEmployee() {
        System.out.println(String.format("%s %s hires an employee", empJobTitle, empName));

    }
    public void fireEmployee() {
        System.out.println(String.format("%s %s fires an employee", empJobTitle, empName));

    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(salary));
    }

}

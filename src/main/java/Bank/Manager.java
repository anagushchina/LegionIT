package Bank;

public class Manager extends Employee {


    public Manager(String name, int id, String dateOfBirth, String address) {
        super(name, id, Consts.MANAGER_TYPE, dateOfBirth, address, Consts.MANAGER_DEFAULT_SALARY);
    }

    public void hireEmployee() {
        System.out.println(String.format("%s %s hires an employee", Consts.MANAGER_TYPE, empName));

    }
    public void fireEmployee() {
        System.out.println(String.format("%s %s fires an employee", empJobTitle, empName));

    }

    public void printEmpDetails(){
        System.out.println("***************");
        System.out.println(toString(Consts.MANAGER_DEFAULT_SALARY));
    }

}

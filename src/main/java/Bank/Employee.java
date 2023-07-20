package Bank;

public abstract class Employee {
    String empName;
    int empId;
    String empJobTitle;
    String empDateOfBirth;
    String empAddress;
    int empSalary;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpJobTitle() {
        return empJobTitle;
    }
    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }

    public String getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public int getSalary() {
        return empSalary;
    }
    public void setSalary(int salary) {
        this.empSalary = salary;
    }


    public Employee(String name, int id, String jobTitle, String dateOfBirth, String address, int salary){
        this.empName = name;
        this.empId = id;
        this.empJobTitle = jobTitle;
        this.empDateOfBirth = dateOfBirth;
        this.empAddress = address;
        this.empSalary = salary;
    }

    public void receiveSalary(){
        System.out.println(String.format("%s %s receives salary", empJobTitle, empName));
    }


    public String toString(int salary){
        String details = String.format("Name: %s, ID: %d, Title: %s, Birth date: %s, Address: %s, Salary: %d", empName, empId, empJobTitle, empDateOfBirth, empAddress, salary);
        return details;
    }



}

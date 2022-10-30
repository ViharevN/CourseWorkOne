public class Employee {
    private int departNum;
    private String firstName;
    private String middleName;
    private String lastName;
    private double salary;
    private final int id;
    public static int counter = 1;

    public Employee(int departNum, String firstName, String middleName, String lastName, double salary) {
        this.departNum = departNum;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public int getDepartNum() {
        return departNum;
    }

    public void setDepartNum(int departNum) {
        this.departNum = departNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName(Employee[] arr) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
        return  "Номер отдела: " + departNum +
                ", Имя: " + firstName +
                ", Отчество:  " + middleName +
                ", Фамилия: " + lastName +
                ", Зарплата: " + salary +
                ", ID: " + id;
    }
}

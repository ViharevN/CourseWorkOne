
public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[10];
        arr[0] = new Employee(1, "Nick", "Andreevich", "Viharev", 1100);
        arr[1] = new Employee(1, "Andrey", "Sanych", "Piharev", 1300);
        arr[2] = new Employee(1, "Bob", "Maximych", "Shiharev", 1400);
        arr[3] = new Employee(1, "Alex", "Petrovich", "Buharev", 1700);
        arr[4] = new Employee(1, "Sasha", "Spilbergovich", "Suharev", 1000);
        arr[5] = new Employee(1, "Garik", "Martirosyanovich", "Traktorev", 1100);
        arr[6] = new Employee(1, "Georg", "Hachaturyanovich", "Siharev", 1300);
        arr[7] = new Employee(1, "Vlad", "Andreevich", "Harin", 1500);
        arr[8] = new Employee(1, "Bubba", "Andreevich", "Suharin", 1400);
        arr[9] = new Employee(1, "Sam", "Mihalych", "Buharin", 1150);

        EmployeesActions.printAllEmployees(arr);//все сотрудники список
        EmployeesActions.printSumSalaries(arr);//выводим все затраты на зарплаты за месяц
        EmployeesActions.minSalary(arr);//выводим значение минимальной зарплаты у сотрудников
        EmployeesActions.maxSalary(arr);//выводим максимальное значение зарплаты у сотрудников
        EmployeesActions.meanSalary(arr);//выводим среднюю зарплату у сотрудников
        EmployeesActions.printAllNamesEmployees(arr);//выводим все ФИО сотрудников



    }
}
public class EmployeesActions {
    public static void printAllEmployees(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static double printSumSalaries(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum = sum + arr[i].getSalary();
            }
        }
        System.out.println("Сумма всех затрат на зарплаты: "+sum);
        return sum;
    }

    public static void minSalary(Employee[] arr) {
        double min = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата: "+min);
    }

    public static void maxSalary(Employee[] arr) {
        double max = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата: "+max);
    }

    public static void meanSalary(Employee[] arr) {
        double mean = printSumSalaries(arr) / arr.length;
        System.out.println("Средняя зарплата: "+mean);
    }

    public static void printAllNamesEmployees(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getFullName(arr));
            }
        }
    }

}

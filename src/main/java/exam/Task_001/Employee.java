package exam.Task_001;

public class Employee {

    private double salary;

    public void tax(double salary) {
        double tax;
        double income;
        if (salary < 300) {
            System.out.printf("The tax is not paid.\n");
        } else {
            tax = salary * 0.15;
            income = salary - tax;
            System.out.printf("The tax is: %s UAH, The income is : %s UAH\n", tax, income);
        }
    }

    public void compatibilityTax (double salary) {
        double tax = salary * 0.20;
        double income = salary - tax;
        System.out.printf("Compatibility tax is: %s UAH, The income is : %s UAH\n", tax, income);
    }
}

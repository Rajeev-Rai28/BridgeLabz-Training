/*
Create a program to find the bonus of 10 employees based on their years of service
and calculate total bonus, old salary, and new salary for Zara company.
*/

public class ZaraEmployeeBonus {

    // Method to generate salary and years of service
    // 2D Array: [employee][0 = salary, 1 = years of service]
    public double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {

            // Generate 5-digit salary (10000 to 99999)
            double salary = 10000 + Math.random() * 90000;

            // Generate years of service (1 to 10)
            int yearsOfService = 1 + (int) (Math.random() * 10);

            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }

        return data;
    }

    // Method to calculate new salary and bonus
    // 2D Array: [employee][0 = new salary, 1 = bonus]
    public double[][] calculateBonus(double[][] data) {

        double[][] newData = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {

            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus;

            // Bonus logic
            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }

    // Method to calculate totals and display result
    public void displayResult(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmployee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t\t%.2f\t%.0f\t%.2f\t%.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("TOTAL\t\t%.2f\t\t%.2f\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {

        int totalEmployees = 10;

        // Create object
        ZaraEmployeeBonus zara = new ZaraEmployeeBonus();

        // Generate employee data
        double[][] employeeData = zara.generateEmployeeData(totalEmployees);

        // Calculate bonus and new salary
        double[][] updatedData = zara.calculateBonus(employeeData);

        // Display final result
        zara.displayResult(employeeData, updatedData);
    }
}

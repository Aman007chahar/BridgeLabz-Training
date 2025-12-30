package employeewagecomputation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    Random random = new Random();
    List<Integer> dailyWages = new ArrayList<>();

    void displayWelcome() {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("Running on Master Branch");
        System.out.println("--------------------------------------------");
    }

    int checkAttendance() {
        return random.nextInt(2);
    }

    int getWorkHours(int attendanceType) {
        switch (attendanceType) {
            case 1:
                return FULL_DAY_HOUR;
            case 2:
                return PART_TIME_HOUR;
            default:
                return 0;
        }
    }

    void calculateMonthlyWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {

            totalDays++;
            int attendance = checkAttendance();

            int workType;
            if (attendance == 1) {
                workType = random.nextInt(3);
            } else {
                workType = 0;
            }

            int hoursWorked = getWorkHours(workType);
            totalHours += hoursWorked;

            int dailyWage = hoursWorked * WAGE_PER_HOUR;
            dailyWages.add(dailyWage);
        }

        int totalWage = dailyWages.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Monthly Wage: ₹" + totalWage);
    }
}

public class EmployeeWageMain {
    public static void main(String[] args) {

        EmployeeWage employee = new EmployeeWage();
        employee.displayWelcome();
        employee.calculateMonthlyWage();
    }
}

package employeewagecomputation2;

import java.util.Random;

public class EmployeeWageComputation {

    static final int IS_ABSENT = 0;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empCheck = random.nextInt(3);
            int workHours = 0;

            switch (empCheck) {

                case IS_FULL_TIME:
                    workHours = FULL_DAY_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Full Time");
                    break;

                case IS_PART_TIME:
                    workHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Part Time");
                    break;

                default:
                    workHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Employee is Absent");
            }

            totalWorkingHours += workHours;
            int dailyWage = workHours * WAGE_PER_HOUR;
            totalWage += dailyWage;

            System.out.println("Daily Wage: ₹" + dailyWage);
            System.out.println("--------------------------------");
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Monthly Wage: ₹" + totalWage);
    }
}


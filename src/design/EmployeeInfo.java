package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractClass implements Employee{

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */


    @Override
    public int employeeId() {
        int id = 1111;
        System.out.println("employee ID is :"+id);
        return id;
    }


    @Override
    public String employeeName() {
        String name = "Lyes";
        System.out.println("employee name is :"+name);
        return name;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        int salary = 200000;
        System.out.println("employee salary is :"+salary);
        return salary;
    }

    @Override
    public void benefitLayout() {

    }

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    static String name;
    static int salary=200000;
    private int employeeId;


    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    public EmployeeInfo(){

    }
    public EmployeeInfo(int employeeId) {
        this.employeeId=employeeId;
    }

    public EmployeeInfo(String name, int employeeId) {
        this.name=name;
        this.employeeId=employeeId;
    }


    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany,int performance) {
        int total = 0;
        int bonus;

        // using the calculateSalary
        EmployeeInfo employeeInfo =new EmployeeInfo();
        employeeInfo.calculateSalary();

        if(performance >= 10){
            bonus = (int) (salary * .1);
            System.out.println("Best performance employees bonus = "+bonus);

            if (numberOfYearsWithCompany >= 5){
                total = salary + bonus;
            }
            System.out.println("total with best performance is: "+total);

        }else
        {
            bonus = (int) (salary*.08);
            System.out.println("Average performance employees bonus = $"+bonus);}

        if (numberOfYearsWithCompany < 5){
            total = salary + bonus;
        }
        System.out.println(" total with average performance is: "+total);

        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start year (example: 2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter end year (example: 2017): ");
        String todaysDate = sc.nextLine();

        //implement numbers of year from above two dates
        //Calculate pension


        int StartingDate=2018;
        int CurrentDate=2020;
        if (CurrentDate-StartingDate==1){
            total = (int) (salary * .05);


        }else if (CurrentDate - StartingDate >= 2 ){
            total = (int) (salary * .1);

        }else total =0;


        System.out.println("The total pension salary is "+total);
        return total;
    }



    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}

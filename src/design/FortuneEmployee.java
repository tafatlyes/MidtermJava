package design;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {

        EmployeeInfo emp= new EmployeeInfo();
        EmployeeInfo emp1 = new EmployeeInfo(1045);
        EmployeeInfo emp2= new EmployeeInfo("Lyes",1045);

        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.employeeAge();
        employeeInfo.employeeId();
        employeeInfo.calculateSalary();
        employeeInfo.employeeName();


        EmployeeInfo.setCompanyName("PNT");
        System.out.println(EmployeeInfo.getCompanyName());

        employeeInfo.calculateEmployeeBonus(3, 9);


        EmployeeInfo.calculateEmployeePension();

    }

}

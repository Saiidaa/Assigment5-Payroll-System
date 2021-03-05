package com.company;

@SpringBootApplication
public class Main {

   public static EmployeeSalaried employeeSalaried;
    public static EmployeeHourly employeeHourly;
    public static EmployeeCommission employeeCommission;
    public static EmployeeBasePlus employeeBasePlus;

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new EmployeeSalaried("Yergesheva", "Saida", "283366","45.222");
        employees[1] = new EmployeeHourly("Amarova", "Karina", "24556","34", "4500");
        employees[2] =  new EmployeeCommission("John", "Doe", "27445", 945, 0.1);
        employees[3] = new EmployeeBasePlus("Rose", "Miy", "27895", 4512, 054, 5945);



        System.out.println("Employees processed: ");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            EmployeeBasePlus employee = (EmployeeBasePlus) currentEmployee;

    }
}

package projectB;

import java.io.*;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("King ", new Date(2000,1,7),"CEO");
        employees[1] = new Employee("Queen", new Date(2011,5,12),"Manager");
        employees[2] = new Employee("Princess", new Date(2016,12,12),"Lawyer");
        employees[3] = new Employee("Prince", new Date(2018,7,7),"Engineer");
        employees[4] = new Employee("Knight", new Date(2000,1,13),"Fighter");

        Employee addEmployees = null;

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("ProjectBRepertory.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find file.");
            System.exit(0);
        }
        for (Employee employee: employees) {
            writeToFile(employee, printWriter);
        }
        printWriter.close();

        Scanner readFile = null;


        Scanner input = new Scanner(System.in);

        while (true) {
            printMenu();
            int num = input.nextInt();

            switch (num) {
                case 0 :
                    System.out.println("Terminates the program.");
                    System.exit(0);

                case 1 :
                    try {
                        readFile = new Scanner(new FileInputStream("ProjectBRepertory.txt"));
                    } catch (FileNotFoundException e) {
                        System.out.println("Couldn't find file.");
                        System.exit(0);
                    }
                    readFromFile(readFile);
                    readFile.close();
                    break;

                case 2 :
                    try {
                        printWriter = new PrintWriter(new FileOutputStream("ProjectBRepertory.txt", true));
                    } catch (FileNotFoundException e) {
                        System.out.println("Couldn't find file.");
                        System.exit(0);
                    }

                    addEmployees = createNewEmployee();
                    writeToFile(addEmployees, printWriter);
                    printWriter.close();
                    employees = makeNewListOfEmployees(employees, addEmployees);
                    break;

                case 3 :
                    searchEmployees(employees);
                    break;
                default:
                    break;
            }

        }

    }

    public static void writeToFile(Employee employee, PrintWriter printWriter) {

        printWriter.println(employee);
    }

    public static void readFromFile(Scanner readFile) {

        while (readFile.hasNext()) {
            System.out.println(readFile.nextLine());
        }
    }

    public static void printMenu() {
        System.out.println("===========================================================");
        System.out.println("1.\t Print All Employee (It already has 5 employees)");
        System.out.println("2.\t Add New Employee");
        System.out.println("3.\t Search Employees as Hired Date");
        System.out.println("0.\t Quit");
        System.out.println("===========================================================");
    }

    public static Employee createNewEmployee(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of employee : ");
        String name = input.next();

        System.out.print("Enter the hired year : ");
        int year = input.nextInt();

        System.out.print("Enter the hired month : ");
        int month = input.nextInt();

        System.out.print("Enter the hired day : ");
        int day = input.nextInt();

        System.out.print("Enter the position of employee : ");
        String position = input.next();

        return new Employee(name, new Date(year,day,month), position);
    }

    public static Employee[] makeNewListOfEmployees(Employee[] employees, Employee addEmployee) {

        Employee[] listOfEmployee = new Employee[employees.length + 1];

        for (int i = 0; i < listOfEmployee.length; i++) {
            if (i == listOfEmployee.length-1) {
                listOfEmployee[i] = addEmployee;
                break;
            }
            listOfEmployee[i] = employees[i];
        }

        return listOfEmployee;
    }

    public static void searchEmployees(Employee[] employees) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hired date to search for employees");
        System.out.print("Year : ");
        int year = input.nextInt();

        System.out.print("Month : ");
        int month = input.nextInt();

        System.out.print("Day : ");
        int day = input.nextInt();

        for (Employee employee : employees) {
            if (employee.getHiredDate().getYear() < year)
                System.out.println(employee);
            else if (employee.getHiredDate().getYear() == year && employee.getHiredDate().getMonth() < month)
                System.out.println(employee);
            else if (employee.getHiredDate().getYear() == year && employee.getHiredDate().getMonth() == month &&
            employee.getHiredDate().getDay() <= day)
                System.out.println(employee);
        }

    }
}

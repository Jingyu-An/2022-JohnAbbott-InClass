package session1Activity;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Queen");
        employee1.setAge(28);
        employee1.setSalary(70000);

        Employee employee2 = new Employee("King", 30, 80000);
        Employee employee3 = new Employee("Queen", 28, 70000);

        System.out.println("================equals================");
        if (employee1.equals(employee2)){
            System.out.println("employee1 and employee2 are same");
        }
        if (employee1.equals(employee3)){
            System.out.println("employee1 and employee3 are same");
        }
        if (employee2.equals(employee3)){
            System.out.println("employee2 and employee3 are same");
        }

        System.out.println("===============toString===============");

        if (employee1.toString().contentEquals(employee2.toString())){
            System.out.println("employee1 and employee2 are same");
        }

        if (employee1.toString().contentEquals(employee3.toString())){
            System.out.println("employee1 and employee3 are same");
        }

        if (employee2.toString().contentEquals(employee3.toString())){
            System.out.println("employee2 and employee3 are same");
        }
    }
}

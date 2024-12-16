package application;

import entities.Employee;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        System.out.println();

        List<Employee> list = new ArrayList<Employee>();

        for (int i=1; i<(N+1); i++) {
            System.out.println("Employee " + "#" + i);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            // erro no consumo da quebra de linha pelo sc.nextInt
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary: ");
        int employeeId = sc.nextInt();
        // variavel de found criada para correção de encontrar o id na lista
        boolean found = false;

        for (Employee x : list) {
            if (x.getId().equals(employeeId)) {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                // criado um metodo externo para aumento do salario
                x.increaseSalary(percentage);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This id does not exist!");
        }

        /*for (Employee x : list) {
            System.out.print("Enter the employee id that will have salary: ");
            int employeeId = sc.nextInt();
            if (employeeId == x.getId()) {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                x.setSalary(percentage);
            }
            else {
                System.out.println("This id does not exist!");
                break;
            }
        }*/

        System.out.println();
        System.out.println("List of employees:");

        for (Employee x : list) {
            System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
        }
    }
}

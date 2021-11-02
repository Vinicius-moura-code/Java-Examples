package views.atividadeList;

import models.atividadeList.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
        Scanner tec = new Scanner(System.in);
        System.out.println("How many employees will be registered ? " + System.lineSeparator());
        int n = tec.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (var i = 1; i <= n; i++) {

            System.out.println("Emplyoee #" + i);
            System.out.print("Id: ");
            int id = tec.nextInt();
            System.out.print("Name: ");
            String nome = tec.next();
            System.out.print("Salary: ");
            double salario = tec.nextDouble();
            System.out.println(System.lineSeparator());
            var checkId = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (checkId == null) {
                employees.add(
                        new Employee(
                                id, nome, salario
                        ));
            } else {
                System.out.println("Esse id já existe, por favor digite outro");
                i--;
            }

        }
        System.out.print("Enter the employee is that will have salary increase : ");
        int increasedId = tec.nextInt();
        System.out.print("Enter the percentage : " + System.lineSeparator());
        double percentage = tec.nextDouble();

        Employee emp = employees.stream().filter(x -> x.getId() == increasedId).findFirst().orElse(null);
        if (emp != null) {
            emp.increaseSalary(percentage);
        } else {
            System.out.println("O ID informado não existe" + System.lineSeparator());
        }

        System.out.println("List of employees:");

        for (var item : employees) {
            System.out.println(item.getId() + ", " + item.getName() + ", " + item.getSalary());
        }
        tec.close();
    }
}

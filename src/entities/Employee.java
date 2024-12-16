package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += (this.salary * (percentage/100.0));
    }
}

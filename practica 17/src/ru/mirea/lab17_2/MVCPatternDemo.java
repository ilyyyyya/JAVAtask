package ru.mirea.lab17_2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView();

        controller.setEmployeeSalary("150.000 $");
        System.out.println("\n" +
                "New update about the salary of an employee");
        controller.updateView();

    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Ivan Ivanvich");
        employee.setSalary("50.000 RUB");
        return employee;
    }
}

package ru.mirea.lab17_2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }

    public String getEmployeeSalary() {
        return model.getSalary();
    }

    public void setEmployeeSalary(String salary) {
        model.setSalary(salary);
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}

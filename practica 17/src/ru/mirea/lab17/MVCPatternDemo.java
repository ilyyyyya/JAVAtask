package ru.mirea.lab17;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();

        controller.setStudentRollNo("IKBO-01-21");
        System.out.println("New update");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Ilya");
        student.setRollNo("IKBO-30-21");
        return student;
    }
}

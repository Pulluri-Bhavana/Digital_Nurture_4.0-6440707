package mvcpattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.setStudentName("Priya");
        controller.setStudentId("ST1234");
        controller.setStudentGrade("A");

        controller.updateView();

        controller.setStudentGrade("A+");
        controller.updateView();
    }
}

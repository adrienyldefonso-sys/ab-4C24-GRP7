public class StudentController {

    public static void main(String[] args) {
        StudentModel student = new StudentModel(
            1,
            "Brayan",
            "brayan@gmail.com"
        );

        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getName());
        System.out.println("Correo: " + student.getEmail());
    }
}
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Student {
    private String name;
    private LocalDate dateOfBirth;
    private int age;

    public Student(String name, int age, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        System.out.println("Student Age: " + age);
    }

    public void displayDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date of Birth: " + dateOfBirth.format(formatter));
    }

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2000, 4, 15);

        Student student = new Student("John Doe", 25, dateOfBirth);

        student.displayName();
        student.displayDateOfBirth();
        student.displayAge();
    }
}

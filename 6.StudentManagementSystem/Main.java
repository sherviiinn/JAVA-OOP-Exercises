public class Main {
    public static void main(String[] args) {

        //** this is a simple main class to test the classes, you can make a complete student management system with this classes if you want **//
    
        Admin admin = new Admin();
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        Course math = new Course("Mathematics");
        Course history = new Course("History");

        admin.addStudent(student1);
        admin.addStudent(student2);
        admin.addCourse(math);
        admin.addCourse(history);

        student1.enrollInCourse("Mathematics");
        student1.assignGrade("Mathematics", 95.5);
        student1.printGrades();
    }
}
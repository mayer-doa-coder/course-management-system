// Simple demo of Course Management System
public class Main {
    public static void main(String[] args) {
        // Create lessons with duration and instructor
        Lesson lesson1 = new Lesson("Java Basics", "2 hours", "Prof. Smith");
        Lesson lesson2 = new Lesson("OOP Concepts", "3 hours", "Prof. Johnson");
        Lesson lesson3 = new Lesson("Data Structures", "4 hours", "Prof. Brown");
        
        // Create modules
        CourseModule module1 = new CourseModule("Programming Fundamentals");
        module1.add(lesson1);
        module1.add(lesson2);
        
        CourseModule mainCourse = new CourseModule("Computer Science Course");
        mainCourse.add(module1);
        mainCourse.add(lesson3);
        
        // Show course structure
        System.out.println("=== Course Management System ===");
        mainCourse.showDetails();
    }
}
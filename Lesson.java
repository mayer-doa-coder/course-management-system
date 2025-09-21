// Simple lesson class
public class Lesson implements CourseComponent {
    private String name;
    private String duration;        // Added for merge conflict simulation
    private String instructorName;  // Added for merge conflict simulation
    
    public Lesson(String name) {
        this.name = name;
        this.duration = "1 hour";     // Default duration
        this.instructorName = "TBA";  // Default instructor
    }
    
    public Lesson(String name, String duration, String instructorName) {
        this.name = name;
        this.duration = duration;
        this.instructorName = instructorName;
    }
    
    @Override
    public void showDetails() {
        System.out.println("Lesson: " + name + " | Duration: " + duration + " | Instructor: " + instructorName);
    }
}
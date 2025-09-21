import java.util.ArrayList;
import java.util.List;

// Simple course module that can contain lessons or other modules
public class CourseModule implements CourseComponent {
    private String name;
    private List<CourseComponent> components;
    
    public CourseModule(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }
    
    public void add(CourseComponent component) {
        components.add(component);
    }
    
    @Override
    public void showDetails() {
        System.out.println("Module: " + name);
        for (CourseComponent component : components) {
            System.out.print("  ");
            component.showDetails();
        }
    }
}
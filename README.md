# Course Management System

## Overview
A Java-based Course Management System that allows instructors to build Course Modules. Each module may contain lessons or sub-modules, and both must be treated the same way when displaying details.

## Design Pattern Used
**Composite Design Pattern** - This pattern is perfect for representing part-whole hierarchies where courses contain modules, and modules can contain lessons or other sub-modules.

## Project Structure

### Core Components

1. **CourseComponent.java** - Common interface for all course components
   - Defines `showDetails()` method that all components must implement

2. **Lesson.java** - Leaf component representing individual lessons
   - Contains: name, duration, instructorName
   - Cannot contain other components

3. **CourseModule.java** - Composite component representing course modules
   - Can contain multiple lessons or other course modules
   - Provides `add()` method to build hierarchy

4. **Main.java** - Demonstration class
   - Creates sample course structure
   - Shows hierarchical display of course content

## How to Run

```bash
# Compile all Java files
javac *.java

# Run the demonstration
java Main
```

## Sample Output
```
=== Course Management System ===
Module: Computer Science Course
  Module: Programming Fundamentals
  Lesson: Java Basics | Duration: 2 hours | Instructor: Prof. Smith
  Lesson: OOP Concepts | Duration: 3 hours | Instructor: Prof. Johnson
  Lesson: Data Structures | Duration: 4 hours | Instructor: Prof. Brown
```

## Design Pattern Benefits

### Composite Pattern Advantages:
- **Uniform Treatment**: Both lessons and modules implement the same interface
- **Flexibility**: Easy to add new component types
- **Scalability**: Supports unlimited nesting levels
- **Simplicity**: Client code treats all components uniformly

### Pattern Structure:
- **Component**: `CourseComponent` interface
- **Leaf**: `Lesson` class (cannot contain others)
- **Composite**: `CourseModule` class (can contain multiple components)

## Features Implemented

✅ Common interface for course components with `showDetails()` method  
✅ Lesson class with name, duration, and instructor attributes  
✅ CourseModule class that can contain lessons or other modules  
✅ Sample course module with sub-modules and lessons  
✅ Hierarchical display of all course details  
✅ Composite Design Pattern implementation  

## Git Workflow Completed

1. ✅ Created feature/module-management branch
2. ✅ Implemented the coding task (Part B requirements)
3. ✅ Added duration and instructorName attributes (for merge conflict simulation)
4. ✅ Committed and pushed changes
5. ✅ Ready for Pull Request creation

## Data Flow Diagram
See `DataFlowDiagram.md` for the Level-1 DFD of the Course Management System.

---
*This project demonstrates the Composite Design Pattern in a real-world scenario of managing hierarchical course structures.*
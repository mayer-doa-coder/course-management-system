# Data Flow Diagram (DFD) - Course Management System

## Level 1 DFD for Course Management System

### External Entities:
1. **Instructor** - Creates and manages course content
2. **Student** - Views course structure and content
3. **Administrator** - Manages overall system

### Processes:
1. **Create Course Components** - Process to create lessons and modules
2. **Organize Course Structure** - Process to add components to modules
3. **Display Course Details** - Process to show course hierarchy

### Data Stores:
1. **Course Repository** - Stores course modules and lessons
2. **Component Registry** - Maintains component relationships

### Data Flows:

#### From External Entities to Processes:
- Instructor → Create Course Components: Course Content Data
- Instructor → Organize Course Structure: Structure Information
- Student → Display Course Details: View Request
- Administrator → Create Course Components: System Configuration

#### From Processes to Data Stores:
- Create Course Components → Course Repository: Lesson/Module Data
- Organize Course Structure → Component Registry: Hierarchy Data

#### From Data Stores to Processes:
- Course Repository → Display Course Details: Course Data
- Component Registry → Display Course Details: Structure Data

#### From Processes to External Entities:
- Display Course Details → Student: Course Structure Display
- Display Course Details → Instructor: Course Overview
- Create Course Components → Instructor: Confirmation

### DFD Description:

The Course Management System follows a hierarchical data flow where:

1. **Input Flow**: Instructors provide course content (lessons) and structural information (how to organize modules)

2. **Processing Flow**: 
   - Course components are created and stored
   - Components are organized into hierarchical structures
   - The system maintains relationships between modules and lessons

3. **Output Flow**: Students and instructors can view the organized course structure with all details displayed hierarchically

4. **Data Storage**: 
   - Course Repository stores the actual lesson and module content
   - Component Registry maintains the parent-child relationships for the composite structure

This DFD represents the **Composite Design Pattern** implementation where the system treats individual lessons and course modules uniformly through the CourseComponent interface.
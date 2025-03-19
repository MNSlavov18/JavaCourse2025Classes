package university;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramType programType;
    private List<Course> courses;

    public Program(String name, ProgramType programType) {
        this.name = name;
        this.programType = programType;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    public boolean addCourse(Course course) {
        if (courses.contains(course)) {
            return false;
        }
        return this.courses.add(course);
    }

    public Course removeCourse(int index) {
        return this.courses.remove(index);
    }

    public void printCourses() {
        for (Course course : this.courses) {
            System.out.println(course);
        }
    }

    public void printCoursesByType(CourseType courseType) {
        for (Course course : this.courses) {
            if(course.getCourseType().equals(courseType)) {
                System.out.println(course);
            }
        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programType=" + programType +
                ", courses=" + courses +
                '}';
    }

    public int getCourseListSize() {
        return courses.size();

    }
}

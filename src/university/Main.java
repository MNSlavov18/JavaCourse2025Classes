package university;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java",6,CourseType.REQUIRED);
        Course course2 = new Course("Java",6,CourseType.ELECTIVE);
        Course course3 = new Course("C++",3,CourseType.REQUIRED);
        Course course4 = new Course("C++",3,CourseType.ELECTIVE);

        System.out.println(course);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);

        Program program = new Program("It",ProgramType.MAJOR);
        Program program2 = new Program("Business",ProgramType.MINOR);
        System.out.println(program);
        System.out.println(program2);

        program.addCourse(course);
        program.addCourse(course2);
        program2.addCourse(course3);

        System.out.println(program);
        System.out.println(program2);

        program.printCourses();

        System.out.println("==============");

        System.out.println(program.getCourseListSize());

        program.printCoursesByType(CourseType.ELECTIVE);
        program.removeCourse(1);
        program.printCoursesByType(CourseType.REQUIRED);

        ProgramType.MAJOR.setProgramTypeCredits(260);

        System.out.println("Credits needed:" + program.getProgramType().getProgramTypeCredits());
    }
}

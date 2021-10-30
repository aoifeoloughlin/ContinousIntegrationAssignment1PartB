import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.joda.time.DateTime;

    public class test {
        public static void main(String args[]) {
            //Add mock data to the driver class to run with part a which is a build dependency
            Student s1 = new Student("Harry Williams", 21, new DateTime("2000-02-11"), 12343);
            Course c1 = new Course(39482, "Computer Science", new DateTime("2020-09-01"),  new DateTime("2021-05-31"));
            Module m1 = new Module("Software Engineering", 772);

            s1.addCourseToStudent(c1);
            s1.addModuleToStudent(m1);
            m1.addStudentToModule(s1);
            m1.addCourseToModule(c1);
            c1.addStudentToCourse(s1);
            c1.addModuleToCourse(m1);

            Student s2 = new Student("Robin Goodfellow", 19, new DateTime("2002-05-11"), 12567);
            Course c2 = new Course(39456, "Physics", new DateTime("2020-09-01"),  new DateTime("2021-05-31"));
            Module m2 = new Module("Astrophysics", 555);

            s2.addCourseToStudent(c2);
            s2.addModuleToStudent(m2);
            m2.addStudentToModule(s2);
            m2.addCourseToModule(c2);
            c2.addStudentToCourse(s2);
            c2.addModuleToCourse(m2);

            Student s3 = new Student("Lisa Johnson", 21, new DateTime("2001-07-30"), 32541);
            Course c3 = new Course(23421, "Biology", new DateTime("2020-09-01"),  new DateTime("2021-05-31"));
            Module m3 = new Module("Genetics", 250);

            s3.addCourseToStudent(c3);
            s3.addModuleToStudent(m3);
            m3.addStudentToModule(s3);
            m3.addCourseToModule(c3);
            c3.addStudentToCourse(s3);

            Student s4 = new Student("Emily Wayne", 21, new DateTime("2001-09-29"), 65738);
            Module m4 = new Module("Chemistry", 180);
            s4.addCourseToStudent(c3);
            s4.addModuleToStudent(m3);
            m4.addStudentToModule(s3);
            m4.addCourseToModule(c3);
            c3.addStudentToCourse(s4);
            c3.addModuleToCourse(m3);

            m4.addStudentToModule(s2);
            m4.addStudentToModule(s3);
            m3.addStudentToModule(s4);
            s4.addModuleToStudent(m4);
            s3.addModuleToStudent(m4);
            s4.addModuleToStudent(m3);
            c3.addModuleToCourse(m2);

            System.out.println("PRINT MODULES RELATED TO THE COURSE");
            c1.printCourseModules();
            c2.printCourseModules();
            c3.printCourseModules();

            System.out.println("PRINT STUDENTS RELATED TO THE COURSE");
            c1.printCourseStudents();
            c2.printCourseStudents();
            c3.printCourseStudents();

            System.out.println("PRINT MODULES RELATED TO THE STUDENT");
            s1.printStudentModules();
            s2.printStudentModules();
            s3.printStudentModules();
            s4.printStudentModules();

            System.out.println("PRINT COURSES RELATED TO THE STUDENT");
            s1.printStudentCourses();
            s2.printStudentCourses();
            s3.printStudentCourses();
            s4.printStudentCourses();

            System.out.println("PRINT STUDENTS RELATED TO MODULE");
            m1.printModuleStudents();
            m2.printModuleStudents();
            m3.printModuleStudents();
            m4.printModuleStudents();

            System.out.println("PRINT COURSES RELATED TO MODULE");
            m1.printModuleCourses();
            m2.printModuleCourses();
            m3.printModuleCourses();
            m4.printModuleCourses();
        }

    }

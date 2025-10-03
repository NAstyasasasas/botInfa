import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Files {

    public static List<Courses> listOfCourses() throws IOException {
        List<Courses> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/anastasia/Documents/JavaBot/task1/src/courses.txt"));

        String line;

        while((line = br.readLine()) != null) {
            String[] data = line.split("\\|");
            Courses courses = new Courses(data[0], data[1], Integer.parseInt(data[2]), data[3]);
            list.add(courses);
        }
        br.close();
        return list;
    }
    public static List<Attendance> listOfAttendance() throws IOException {
        List<Attendance> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/anastasia/Documents/JavaBot/task1/src/attendance.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            line.trim();

            String[] data = line.split("\\|");
            Attendance attendance = new Attendance(data[0], data[1], data[2], Boolean.parseBoolean(data[3]), data[4]);
            list.add(attendance);
        }
        br.close();
        return list;
    }
    public static List<Grades> listOfGrades() throws IOException{
        List<Grades> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/anastasia/Documents/JavaBot/task1/src/grades.txt"));

        String line;
        while((line = br.readLine()) != null) {
            String[] data = line.split("\\|");
            Grades grades = new Grades(data[0], data[1], Double.parseDouble(data[2]), data[3]);
            list.add(grades);
        }
        br.close();
        return list;

    }
    public static List<Students> listOfStudents() throws IOException {
        List<Students> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/anastasia/Documents/JavaBot/task1/src/Students.java")) ;

        String line;

        while((line = br.readLine()) != null) {
            String[] data = line.split("\\|");
            Students students = new Students(data[0], data[1], Integer.parseInt(data[2]), data[3]);
            list.add(students);
        }
        br.close();
        return list;
    }
}

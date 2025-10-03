import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, Integer> taskOne() throws IOException {
        Map<String, Integer> predmet = new HashMap<>();
        List<Attendance> attendance = Files.listOfAttendance();
        for (Attendance attendancec : attendance) {
            if(attendancec.markPoint) {
                predmet.put(attendancec.coursesId, predmet.getOrDefault(attendancec.coursesId,0)+1);
            }
        }
        return predmet;
    }

    public static Courses ofCourse(String id) throws IOException{
        List<Courses> course = Files.listOfCourses();
        for (Courses cour: course) {
            if (id.equals(cour.id)) {
                return cour;
            }
        }
        return null;
    }

    public static Courses sos() throws IOException {
        Map<String, Integer> sosa = taskOne();

        int maxArr = -1;
        String currentKey = " ";
        for (Map.Entry<String, Integer> entry : sosa.entrySet()) {
            if (entry.getValue() > maxArr) {
                maxArr = entry.getValue();
                currentKey = entry.getKey();
            }
        }
        return ofCourse(currentKey);
    }


    public static void main(String[] args) throws IOException {
        System.out.println(sos());
    }

}
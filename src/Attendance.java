public class Attendance {

    String studentId;
    String coursesId;
    String time;
    boolean markPoint;
    String date;

    public Attendance(String studentId, String coursesId, String time, boolean markPoint, String date) {
        this.coursesId = coursesId;
        this.date = date;
        this.time = time;
        this.markPoint = markPoint;
        this.studentId = studentId;
    }
}

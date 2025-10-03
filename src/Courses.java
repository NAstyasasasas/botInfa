public class Courses {
    String id;
    String name;
    int hours;
    String status;

    public Courses(String id, String name, int hours, String status) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.status = status;
    }
    @Override
    public String toString() {
        return id + " " + name;
    }
}

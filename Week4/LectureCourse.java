package Week4;


public class LectureCourse extends Course {
    private int lectureHours;

    public LectureCourse(String name, String code, int lectureHours) {
        super(name, code);
        this.lectureHours = lectureHours;
    }

    @Override
    public int getTotalHours() {
        return lectureHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lecture Hours: " + lectureHours;
    }
}

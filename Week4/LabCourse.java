package Week4;


public class LabCourse extends Course {
    private int labHours;

    public LabCourse(String name, String code, int labHours) {
        super(name, code);
        this.labHours = labHours;
    }

    @Override
    public int getTotalHours() {
        return labHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lab Hours: " + labHours;
    }
}

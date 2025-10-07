package Week4;


public class SeminarCourse extends Course {
    private int seminarHours;
    private String guestSpeaker;

    public SeminarCourse(String name, String code, int seminarHours, String guestSpeaker) {
        super(name, code);
        this.seminarHours = seminarHours;
        this.guestSpeaker = guestSpeaker;
    }

    @Override
    public int getTotalHours() {
        return seminarHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seminar Hours: " + seminarHours + ", Guest Speaker: " + guestSpeaker;
    }
}


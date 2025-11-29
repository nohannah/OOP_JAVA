package Question1;

public class Exception {
    
class StudentAlreadyExistsException extends Exception {
    public StudentAlreadyExistsException(String msg) { super(msg); }
}
class CourseAlreadyExistsException extends Exception {
    public CourseAlreadyExistsException(String msg) { super(msg); }
}
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String msg) { super(msg); }
}
class CourseNotFoundException extends Exception {
    public CourseNotFoundException(String msg) { super(msg); }
}
class CourseFullException extends Exception {
    public CourseFullException(String msg) { super(msg); }
}

}
//input validation  using try and catch in sea limit 

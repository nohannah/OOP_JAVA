import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;  
public class Array {
    import java.util.LinkedList
    public static void main(String[] args) {
        // list.ass(new String (original:"One"));
        // list.ass(new Interger (value : 3));
        // System.out.println("2" + list.get(index:1));
        // ArrayList<String> list = new ArrayList<>();
        // list.add("One");
        // list.add("Two");
        // list.add("Three");
        // System.out.println(list.get(0));  // Outputs: One
        // System.out.println(list.get(1));  // Outputs: Two
        // System.out.println(list.get(2));  // Outputs: Three
        // Vector<String> vect= new Vector<>();
        // Vector.add("hannah");
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add(new Interger (value : 3));
        list.add(new double (value : 3.09));
        list.add(new double (value : 5.0));

        // Display list
        System.out.println("LinkedList: " + list);

    } }
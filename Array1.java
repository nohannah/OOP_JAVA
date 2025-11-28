import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        HashMap<String, Integer> m= new HashMap<>();
        m.put("Hannah",10);
        m.put("Alice",20);
        m.put("Bob",30);
        for( String i:m.keySet())
        System.out.println(i);
        HashSet<Integer> s= new HashSet<>();
        s.add(12);
        s.add(13);
        s.add(14);
        
        s.add(14);
        for( Integer i:s)
        System.out.println(i);
        
    }
}

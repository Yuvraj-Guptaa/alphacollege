package Hashing.Sets;
import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("Prayagraj");
        cities.add("Delhi");
        cities.add("Noida");                            
        cities.add("Gurgaon");
        System.out.println(cities);
        // Iterator it=cities.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
        //advanced loop 

        // for(String city:cities)
        // {
        //     System.out.println(city);
        // }
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("Prayagraj");
        lhs.add("Delhi");
        lhs.add("Noida");                            
        lhs.add("Gurgaon");
       
        System.out.println(lhs);

        TreeSet<String>Ts=new TreeSet<>();
        Ts.add("Prayagraj");
        Ts.add("Delhi");
        Ts.add("Noida");                            
        Ts.add("Gurgaon");
        
        System.out.println(Ts);




        
    }
    
}

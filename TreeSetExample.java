
package Bca3rdsemjava;

import java.util.*;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<String>s=new TreeSet<>();
        s.add("Devendra");
         s.add("Bindu");
          s.add("Hari");
           s.add("Binayak");
            s.add("Soba Raj");
             s.add("Binayak");//adding duplicate elements
             System.out.println(s);
             s.remove("Soba Raj");
             System.out.println(s);
             System.out.println("\nIterating over list: ");
             Iterator<String> itr=s.iterator();
             while(itr.hasNext())
                 System.out.println(itr.next());
    
    
    }
           
            
    
}

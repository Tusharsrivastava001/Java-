// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10);
        s.add(40);
        s.add(20);
        s.add(50);
        s.add(30);
        
        System.out.println(s);
        
        Set<Integer> s1=new LinkedHashSet<>();
        
        s1.add(50);
        s1.add(10);
        s1.add(30);
        s1.add(10);
        s1.add(50);
         
        System.out.println(s1);
        
        
        Set<Integer> s3=new TreeSet<>();
        
        s3.add(50);
        s3.add(10);
        s3.add(30);
        s3.add(10);
        s3.add(50);
         
        System.out.println(s3);
        
        for(Integer ele : s){
            System.out.println(ele);
        }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        
        ArrayList<Integer> list2=new ArrayList<>();
        
        list2.addAll(list);
        System.out.println(list2);
        
        list2.remove(0);
        System.out.println(list2);
        Iterator<Integer> it=list.iterator();
        
        
        while(it.hasNext()){
            System.out.println("Hello bro "+it.next());
        }
        
        
    }
}

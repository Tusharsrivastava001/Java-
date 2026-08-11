// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        System.out.println("Start small. Ship something.");

        map.put(101,"Tushar");
        map.put(102,"shivam");
        map.put(103,"nandu");
        System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.containsKey(101));
        map.remove(101);
        System.out.println(map);
        System.out.println(map.size());


        System.out.println(map.isEmpty());

        System.out.println(map.keySet());

        System.out.println(map.entrySet());


       
    for(Map.Entry<Integer,String> entry : map.entrySet()){
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }

    for(Integer key : map.keySet()){
        System.out.println(map.get(key));
    }
    

    }
}

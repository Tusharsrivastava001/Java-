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
        list2.clear();
        
        System.out.println(list2);
        
        
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
         
        list3.add(40);
        list3.add(2);
         list3.add(30);
           
           System.out.println(list3);
           list3.set(0,10000);
           list3.set(1,454545);
           
           System.out.println(list3);
        //to array use ---  stack/arraylist/linkedlist /list koo array me convert krna chahee haiii 
        
        Object[] arr=list3.toArray();
        
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
           
       
        //contain'
        System.out.println(list2.contains(10000)); 
    
        // Collection<Integer> coll=new ArrayList<>();
        list3.add(500);
        System.out.println(list3);
        
        Collections.sort(list3);
        System.out.println(list3);
        ArrayList<Integer> arr2=(ArrayList<Integer>) list3.clone(); //yaha par
        //type casting karna jaruri hai
        System.out.println(arr2);
        
        ArrayList<Integer> marks=new ArrayList<>();
        
        marks.ensureCapacity(100);
        
        
        System.out.println(marks.isEmpty());
        
        System.out.println(list3.indexOf(40));
        
        
        
    }
}

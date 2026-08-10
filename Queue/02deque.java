import java.util.*;
class Main{
    public static void main(String[] args){
            ArrayDeque<Integer> dq=new ArrayDeque<>();
            dq.add(10);
            dq.add(20);
            dq.add(30);
            dq.add(40);
            dq.add(50);
            
            System.out.println(dq);
            System.out.println(dq.peekFirst());
            
            System.out.println(dq.peekLast());
            
            dq.offerFirst(500);
            dq.offerLast(500);
            
            System.out.println(dq);
           
    }
}

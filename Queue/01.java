import java.util.*;
class Main{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        
       
    }
}

import java.util.*;
class Main{
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> a-b); //this give the samllest at the top
        //If we do that b-a then we will get the largest at teh top of the  stack
         
        pq.add(50);
        pq.add(4100);
        pq.add(43100);
        pq.add(41300);
        pq.add(410033);
        
        System.out.println(pq.peek());
    }
}

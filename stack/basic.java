import java.util.*;
class Main{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        System.out.println(st);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        
         System.out.println(st);
         
         if(st.empty()){
             System.out.println("Your queue is empty man");
         }
         else{
             System.out.println("Stack is havin the elements ");
         }
         
         //search method 
         System.out.println(st.search(20));
         
         System.out.println(st.get(0));
         
         System.out.println(st.pop());
         
         System.out.println(st);
    }
}

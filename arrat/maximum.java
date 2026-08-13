import java.util.*;
class Main {
    public static void main(String[] args) {
       System.out.println("here we will calucate the maiximum of the ARRAY");
       int[] v=new int[6];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<6;i++){
        v[i]=sc.nextInt();
       }
       int maxi=0;
       for(int i=0;i<6;i++){
        if(v[i]>maxi){
            maxi=v[i];
        }
       }
       System.out.println(maxi);
    }

}

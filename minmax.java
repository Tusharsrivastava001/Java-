import java.util.*;
class Main{
    public static void main(String[] args){
        System.out.println("Hello bro from the univeristy");
        //here we have to print the second maxiamu

       
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int tmin=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(min>arr[i]){
                tmin=smin;
                smin=min;
                min=arr[i];  
            }
            else if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];
            }
            else if(arr[i]<tmin && arr[i]!=smin && arr[i]!=min){
                tmin=arr[i];
            }
        }

        System.out.println(min+" "+smin+" "+tmin);



    }
}

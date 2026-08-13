import java.util.*;
class Main {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,5,6,6,77,8,888,88};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[0]);
        System.out.println("Start small. Ship something.");


        int k=0;
        while(k<5){
            System.out.println(arr[k]);
            k++;
        }

        int[] arri=new int[7];
        for(int i=0;i<7;i++){
            System.out.println(arri[i]);
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] v=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            v[i]=x;
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=v[i];
        }
        System.out.println(sum+"This is the sum of the array v");
    }
}

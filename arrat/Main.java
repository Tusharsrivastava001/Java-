import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        for(int ele : arr){
            sum+=ele;
            System.out.println(ele);
        }
        System.out.println("The sum of the arr elements is the "+sum);
        
        System.out.println("Here we have to calculate the minumum of the array");
        
        int minn=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minn){
                minn=arr[i];
            }
        }
        System.out.println(minn);
        
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        System.out.println("Here is the matrix elements");
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}

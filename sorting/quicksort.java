// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={8,7,2,3,5};
        quicksort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("Start small. Ship something.");
    }
}

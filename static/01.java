// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    static int count=40;
};
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,5,5,5,6};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
        System.out.println(Student.count);
    }
    static void change(int[] arr){
        //static we don't have to create the object here so that we can directly 

        arr[2]=88888;
    }
}

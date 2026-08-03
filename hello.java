import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=10;
        char ch='b';
        double b=444.0;
        float c=4.5f;
        boolean d=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int co=(int) b;
        System.out.printf("This is the %d and %d",a,co);
        
        System.out.println(ch);
        System.out.println(co);
        
        String name=sc.nextLine();
        System.out.println(name);
        
        
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        Double aged=sc.nextDouble();
        System.out.println(age);
        System.out.println(aged);
        
        sc.close();
    }
}
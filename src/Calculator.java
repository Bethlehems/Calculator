import java.util.Scanner;

/**
 * Created by betty on 7/13/17.
 */

public class Calculator {
    public static void add(int a,int b){
        System.out.println((a+b));

    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){

        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        System.out.println("First number:");
        int first=sc.nextInt();
        System.out.println("Second number:");
        int second=sc.nextInt();
        while (second==0){
            while (second==0){
            System.out.println("Can not divide. Enter again:");}
        second=sc.nextInt();}
        add(first,second);
        sub(first,second);
        mul(first,second);
        div(first,second);
}
}

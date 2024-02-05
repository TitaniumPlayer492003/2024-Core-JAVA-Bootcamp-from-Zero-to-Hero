import java.util.Scanner;
// import java.io.*;
public class SumOfNumbersUsingRecursion{
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");n = input.nextInt();
        System.out.println(sum(n));
        input.close();
    }
    private static int sum(int n){
        if(n==0){return 0;}
        else{return n + sum(n-1);}
    }
}
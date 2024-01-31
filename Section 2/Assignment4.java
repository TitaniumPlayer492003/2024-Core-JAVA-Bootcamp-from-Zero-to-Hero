// Write a program to display Multiplication for a given number in Java
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] avi){
        Scanner sc = new Scanner(System.in);
        long n,i=1;
        System.out.print("Enter a number: "); n = sc.nextLong();
        while(i<=10){
            System.out.printf("%d X %d = %d\n", n,i,n*i);
            i++;
        }
    sc.close();
    }
}

// Write a Java Program to Find Largest of Three Numbers
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter any three numbers: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        if(a>=b && a>=c){
            System.out.println(a+" is the largest number.");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is the largest number.");
        }
        else{System.out.println(c+" is the largest number.");}
    input.close();
    }
}

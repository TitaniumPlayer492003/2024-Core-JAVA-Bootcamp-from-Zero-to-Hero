import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        int n,result;
        System.out.print("Enter an integer: ");n = input.nextInt();
        result = factorial(n);
        System.out.println(result);
        
    input.close();
    }

    private static int factorial(int n){
        if (n==0){
            return 1;}
        else{
            return n * factorial(n-1);}
    }
}
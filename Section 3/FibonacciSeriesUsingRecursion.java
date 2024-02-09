import java.util.Scanner;
public class FibonacciSeriesUsingRecursion {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");int n = input.nextInt();
        int result = fibonacci(n);
        System.out.print(result);
        input.close();
    }

    private static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

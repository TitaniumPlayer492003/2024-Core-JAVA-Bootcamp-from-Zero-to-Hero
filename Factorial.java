import java.util.Scanner;
public class Factorial {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: "); long n = input.nextLong();
        for (long i=n-1; i>0;i--){
            n= n*i;
        }
        System.out.println(n);
    input.close();
    }
}

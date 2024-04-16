import java.util.Scanner;
public class ReversingAnIntegerThroughLoops{
    public static void main(String[] avi) {
        Scanner sc = new Scanner(System.in);System.out.print("Enter an integer: ");int n = sc.nextInt();
        int result = rev_n(n);
        System.out.println(result);
        sc.close();
    }
    
    private static int rev_n(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10; 
            sum = sum*10 + digit;
            num = num/10; 
        }
        return sum;
    }
}
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter 1st number: "); num1 = input.nextInt();
        System.out.print("Enter 2nd number: "); num2 = input.nextInt();
        int result = gcd(num1,num2);
        // System.out.println("The greatest common divisor of " +num1+" and "+num2+" is: "+result);
        System.out.printf("The greatest common divisor of %d and %d is: %d",num1,num2,result);
        input.close();
    }
    private static int gcd(int a, int b){
            if (b != 0){
                return gcd(b,a%b);
            }
            else{
                return a;
            }
    }
}

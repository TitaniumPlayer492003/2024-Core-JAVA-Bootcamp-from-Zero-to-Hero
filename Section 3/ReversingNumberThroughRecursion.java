import java.util.Scanner;
public class ReversingNumberThroughRecursion {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");long n = input.nextLong();
        recrev(n);
        input.close();
    }

    private static void recrev(long a){
        if (a < 10){
            System.out.print(a); 
        }
        else{
            System.out.print(a%10);
            recrev(a/10);
        }
    } 

}

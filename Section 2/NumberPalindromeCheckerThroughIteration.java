import java.util.Scanner;
public class NumberPalindromeCheckerThroughIteration{
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        long n, temp,ones_n,rev_n=0;
        System.out.print("Enter a number: ");n = input.nextLong();
        temp=n;
        while(n!=0){
            ones_n = n%10;
            rev_n = rev_n*10 + ones_n;
            n = n/10;
        }
        if(rev_n==temp){
            System.out.println(temp + " is a palindrome.");
        }
        else{System.out.println("You bozo!");}
    
    input.close();
    }
}
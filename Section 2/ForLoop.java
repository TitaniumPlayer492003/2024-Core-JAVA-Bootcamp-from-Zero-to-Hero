import java.util.Scanner;
public class ForLoop {
    public static void main(String[] avi) {
        int n,a;
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter an integer: "); n = input.nextInt();a=0;
        if(n>=0){
            for(int i=0;i <= n;i=i+2){
                a=a+i;
                }
                System.out.printf("The sum of all the even integers till %d is: %d%n", n, a);
        }
        else{
            System.out.println("Please enter a positive integer.");
        }
    input.close();
    }
}




// **Question: Sum of Even Numbers**
// Write a Java program that calculates the sum of all even numbers from 1 to a given positive integer `n`. 
// Use a `for` loop to iterate through the numbers and calculate the sum. Print the result.

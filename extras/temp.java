import java.util.Scanner;
public class temp{
    public static void main(String[] avi){
        String s;

        Scanner input = new Scanner(System.in);
        System.out.println("What string do you suspect might be a palindrome? ");s=input.nextLine();

        StringBuilder rev_s = new StringBuilder(s).reverse();

        if(s.equals(rev_s.toString())){
            System.out.printf("Yes, %s is a palindrome.",s);
        }
        else{
            System.out.println("You bozo!");
        }
        input.close();
    }
}
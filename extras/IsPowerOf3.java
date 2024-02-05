import java.util.Scanner;
public class IsPowerOf3 {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        float n;
        System.out.print("Enter an integer: "); n=input.nextFloat();
        boolean result = is_power3(n);
        System.out.print(result);
        input.close();
    }
   
    private static boolean is_power3(float n){ 
        while (n>1){
            n = n/3;
            if (n==1){return true;}
        }
        return false;
    }
}
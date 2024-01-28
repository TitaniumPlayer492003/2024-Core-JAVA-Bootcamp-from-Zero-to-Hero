import java.util.Scanner;
public class IsLeap {
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 3200 == 0){
            System.out.println(year+" is not a leap year.");
        }
        else if (year % 400 == 0 ){
            System.out.println(year+" is a leap year.");
        }
        else if (year % 4 == 0 & year % 100 != 0 ){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    
    input.close();
    }
    
}


import java.util.Scanner;

public class CalculatingGrade{  
    public static void main(String[] avi){
   
        Scanner input = new Scanner(System.in);   
        System.out.print("Enter your marks: ");int marks = input.nextInt();
        input.close();
        if (isPass(marks)){
            if(marks>=90){
                System.out.println("Your grade is A");
            }    
            else if(marks>=80){
                System.out.println("Your grade is B");
            }  
            else if(marks>=70){
                System.out.println("Your grade is C");
            }
            else {
                System.out.println("Your grade is D");
            }
        }
        else{
            System.out.println("Your grade is F");
        }
    }        
    static boolean isPass(int marks){
        if(marks >= 60){
            return true;
        }
        else{
            return false;
        }
    }

}
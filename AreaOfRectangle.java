import java.util.*;
class AreaOfRectangle{
    static Float a,l,b;
    public static void main(String[] avi){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        l = input.nextFloat();
        b= input.nextFloat();
        a = l * b;
        System.out.println("The area of the rectangle is= "+a);
        input.close();
    }
}


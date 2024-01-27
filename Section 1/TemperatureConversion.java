import java.util.Scanner;
public class TemperatureConversion {
    static Float Fahrenheit, Celsius;
        public static void main(String[] avi){
            System.out.print("Enter the temperature in Celcius: ");
            Scanner input = new Scanner(System.in);
            Celsius = input.nextFloat();
            Fahrenheit = (float)(9.0/5)*Celsius + 32;
            System.out.println("Fahrenheit= " + Fahrenheit);
            input.close();
        }
}

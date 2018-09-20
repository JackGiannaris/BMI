import java.util.Scanner;

public class BMI {

    public static void main(String[] args){

        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String name;

        int weight, height;
        double BMI;
        double InchesToMeters;
        double PoundsToKilograms;

        


        System.out.println("what is your name");
        name = keyboard.nextLine();

        System.out.println("What is your weight");
        weight = keyboard.nextInt();

        System.out.println("What is your height(in inches)");
        height = keyboard.nextInt();
        InchesToMeters = height *(0.0254/1);
        System.out.println("Your height from inches to meters is "+InchesToMeters+"m");
        PoundsToKilograms =  weight *(0.453592/1);
        System.out.println("Your weight from pounds to kilometers is "+PoundsToKilograms+"kg");
        BMI = PoundsToKilograms/ InchesToMeters*InchesToMeters;
        System.out.println("Your BMI is "+BMI+".");














    }
}
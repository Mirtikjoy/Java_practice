import java.util.Scanner;

class convert_Fahrenheit_to_Celsius {
    public static void main(String[] args){
        System.out.println("\nconvert Fahrenheit to Celsius\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the Fahrenheit temperature: ");
        float F = input.nextFloat();

        celsius(F);
    }


    public static void celsius(float f){
        float cel = (f - 32) * ((float) 5 /9);
        System.out.println("Celsius: " + cel);
    }
}

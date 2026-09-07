import java.util.Scanner;

class arithmetic {
    public static void main(String[] args){
        System.out.println("welcome to arithmetic calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        float first = input.nextFloat();
        System.out.print("please enter your number: ");
        float second = input.nextFloat();

        calculator(first,second);
    }

    public static void calculator(float first, float second){
        System.out.println("Addition: " + (first + second));
        System.out.println("substraction: " + (first - second));
        System.out.println("multiplication: " + first * second);
        System.out.println("division: " + (first / second));
        System.out.println("remainder: " + first % second);


    }
}

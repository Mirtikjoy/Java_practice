import java.util.Scanner;

class addition_Of_Two_Number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the number: ");
        int num2 = input.nextInt();

        int addition = num1 + num2;
        System.out.println("The sum of the two numbers: " + addition);
    }
}
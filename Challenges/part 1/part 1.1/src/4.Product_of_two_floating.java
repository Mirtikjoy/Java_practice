import java.util.Scanner;

class product_of_two_floating {
    public static void main(String[] args){
        System.out.println("welcome to the addition of floating numbers\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your numbers: ");
        float first = input.nextFloat();
        System.out.print("please enter your number: ");
        float second = input.nextFloat();

        float sum = sum(first,second);
        System.out.println("Total sum: " + sum);
    }

    public static float sum(float first, float second){
        return first + second;
    }
}

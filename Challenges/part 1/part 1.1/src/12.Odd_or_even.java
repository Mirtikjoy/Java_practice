import java.util.Scanner;

class odd_or_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int numb = input.nextInt();

        determines(numb);

    }

    public static void determines(int num){
        if (num <= 0){
            System.out.println("please enter the valid number");
        }

        if (num % 2 == 0){
            System.out.println("The number is even number");
        } else{
            System.out.println("The number is odd number ");
        }
    }
}

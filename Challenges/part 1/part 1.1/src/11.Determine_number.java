import java.util.Scanner;

class determine_number {
    public static void main(String[] args){
        System.out.println("Welcome to check weather the number is positive or negative");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int numb = input.nextInt();

        boolean determine = determine(numb);
        if (determine){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }

    }

    public static boolean determine(int num){
        return num >= 0;
    }
}

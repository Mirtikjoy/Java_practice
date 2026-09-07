import java.util.Scanner;

class swap {
    public static void main(String[] args){
        System.out.println("welcome to swapping numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first number: ");
        int first = input.nextInt();
        System.out.print("please enter second number: ");
        int second = input.nextInt();
        System.out.println("your first number is: " + first);
        System.out.println("your second number is: "+ second);

        int third = first;
        first = second;
        second = third;

        System.out.println("after swap number: "+first);
        System.out.println("after swap number: "+second);

    }

}

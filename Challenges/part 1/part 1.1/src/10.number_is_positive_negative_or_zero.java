import java.util.Scanner;

class number_is_positive_negative_or_zero {
    public static void main(String[] args){
        System.out.println("Welcome to checking the number i.e,  number is positive, negative, \n or zero");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        check_num(num);

    }

    public static void check_num(int myNumb){
        if (myNumb == 0){
            System.out.println("The number is "+myNumb);
        } else if (myNumb < 0) {
            System.out.println("The number is negative " + myNumb);
        } else {
            System.out.println("The number is positive " + myNumb);
        }


    }
}

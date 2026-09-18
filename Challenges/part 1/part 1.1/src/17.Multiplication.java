import java.util.Scanner;

class multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int num = input.nextInt();

        multi(num);
    }

    public static void multi(int numb){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + numb + " = " + i * numb);
        }
    }
}

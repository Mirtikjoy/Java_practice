import java.util.Scanner;

class greatest_Of_ThreeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        int numb1 = input.nextInt();
        System.out.print("please enter the number: ");
        int numb2 = input.nextInt();
        System.out.print("please enter the number: ");
        int numb3 = input.nextInt();

        greatest(numb1,numb2,numb3);

    }

    public static void greatest(int numb1, int numb2, int numb3){
        if (numb1 > numb2 && numb1 > numb3){
            System.out.println(numb1+" is the greatest number");
        } else if (numb2 > numb1 && numb2 > numb3) {
            System.out.println(numb2+" is the greatest number");
        } else {
            System.out.println(numb3+" is the greatest number");
        }
    }
}

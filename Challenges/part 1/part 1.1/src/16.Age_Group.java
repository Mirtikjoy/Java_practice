import java.util.Scanner;

class age_Group {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the person age: ");
        int age = input.nextInt();

        ages(age);

    }

    public static void ages(int age){
        if (age <= 13){
            System.out.println("The person ia Child");
        } else if (age <= 20) {
            System.out.println("The person ia Teen");
            
        } else if (age <= 60) {
            System.out.println("The person ia Adult");

        }else {
            System.out.println("The person ia senior");

        }
    }
}

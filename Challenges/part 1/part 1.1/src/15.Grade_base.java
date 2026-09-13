import java.util.Scanner;

class grade_base {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your mark: ");
        int mark = input.nextInt();

        grades(mark);

    }

    public static void grades(int mark){
        if (mark > 100){
            System.out.println("please enter valid mark");
        }else if (mark >= 90){
            System.out.println("Grade A");
        } else if (mark >= 75) {
            System.out.println("Grade B");
        } else if (mark >= 60) {
            System.out.println("Grade C");
        } else if (mark >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}

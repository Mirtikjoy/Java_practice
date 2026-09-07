import java.util.Scanner;

class Perimeter_of_a_rectangle {
    public static void main(String[] args){
        System.out.println("Welcome to calculation of Perimeter of a rectangle.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the length of rectangle: ");
        float length = input.nextFloat();
        System.out.print("please enter the length of rectangle: ");
        float length1 = input.nextFloat();
        System.out.print("please enter the width of rectangle: ");
        float width1 = input.nextFloat();
        System.out.print("please enter the width of rectangle: ");
        float width2 = input.nextFloat();

        float para = ract(length,length1,width1,width2);
        System.out.println("Total parameter of rectangle: "+ para);

    }

    public static float ract(float length1, float length2, float width1, float width2){
        return (length1 + length2 + width1 + width2);
    }
}

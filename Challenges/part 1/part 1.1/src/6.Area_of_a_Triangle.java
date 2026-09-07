import java.util.Scanner;

class Area_of_a_Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Area of a Triangle");
        System.out.print("Please enter base of triangle: ");
        float base = input.nextFloat();
        System.out.print("Please enter height of triangle: ");
        float height = input.nextFloat();

        float Area = area(base,height);
        System.out.println("Area of triangle: "+ Area);
    }

    public static float area(float base, float height){
        return  ((float) 1 /2) * base * height;
    }
}

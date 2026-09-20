import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        int lcms = LCM(first, second);
        System.out.println("LCM of the two numbers is: " + lcms);
    }

    public static int LCM(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}

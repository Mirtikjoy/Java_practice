import java.util.Scanner;

class leap_Year {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the years: ");
        int year = input.nextInt();

        boolean leapYear = leap(year);
        if (leapYear){
            System.out.println("It is a leap year");
        }else {
            System.out.println("Not leap year");
        }

    }

    public static boolean leap(int years){
        if (years % 4 == 0){
            if (years % 100 == 0){
                if (years % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}

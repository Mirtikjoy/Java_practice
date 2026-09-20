import java.util.Scanner;

class sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the digits: ");
        int num = input.nextInt();


        int sumsOfOdd = sums(num);
        System.out.println("The total sum of the digits: " + sumsOfOdd);

    }

    public static int sums(int numb){

        int total = 0;

        while (numb > 0){
            int lastDigits = numb % 10;
            total +=lastDigits;
            numb /= 10;
        }
        return total;
    }
}

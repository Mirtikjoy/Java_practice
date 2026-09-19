import java.util.Scanner;

class sum_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int numb = input.nextInt();

        int sumOfOdd = sum(numb);
        System.out.println(sumOfOdd);
    }

    public static int sum(int num){
        int odd = 0;
        int i = 1;

        while (i <= num){
            odd += i;
            i += 2;
        }

        return odd;
    }
}

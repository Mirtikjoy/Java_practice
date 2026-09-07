import java.util.Scanner;

class Calcultate_Compound_nterest {
    public static void main(String[] args){
        System.out.println("Calculate Compound interest");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the principal amount: ");
        int p = input.nextInt();
        System.out.print("Please enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.print("please enter duration: ");
        float t = input.nextFloat();

        amount(p,r,t);
    }

    public static void amount(int p, float r, float t){

        float total = p * (1 + r);
        long total_Amount = (long) Math.pow(total,t);
        System.out.println("Amount: "+ total_Amount);
    }
}

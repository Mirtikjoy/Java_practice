import java.util.Scanner;

class calculate_simple_interest {
    public static void main(String[] args){
        System.out.println("calculate simple interest");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the principal amount: ");
        int principle = input.nextInt();
        System.out.print("please enter the time: ");
        float time = input.nextFloat();
        System.out.print("please enter the rate of interest: ");
        float rate = input.nextFloat();

        SIP(principle,time,rate);
    }

    public static void SIP(int principle, float time, float rate){
        float sim = (principle * time * rate)/100;
        System.out.println("Simple interest: " + sim);
    }
}

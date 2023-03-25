import java.util.Scanner;

public class Q19 {

    // (TR) İki sayının en büyük ortak bölenini ve en küçük ortak katını veren kodu yazınız.
    // (EN) Write the code that gives the greatest common divisor and least common multiple of two numbers

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("give two number");

        int num1 =input.nextInt();
        int num2 =input.nextInt();

        int min =Math.min(num1, num2);

        for (int i = min; i>=1; i--){

            if (num1 %i==0 && num2 %i==0){
                System.out.println(num1 + " and " + num2 + " greatest common divisor: " + i );
                int lcm = num1 * num2 /i;
                System.out.println(num1 + " and " + num2 + " least common multiple: " + lcm);
                break;
            }
        }






    }


}

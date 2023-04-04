import java.util.Scanner;

public class Q24 {

    // (TR) Verilen bir sayının basamakları toplamını veren kodu yazınız.
    // (EN) Write the code that gives the sum of the digits of a given number.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Give a number");

        int num =input.nextInt();

        int sum =0;

        for (int i = num; i>0; i/=10){

            sum = sum + i%10;

        }

        System.out.println(sum);


    }

}

import java.util.Scanner;

public class Q21 {

    // (TR) Verilen sayının mükemmel sayı olup olmadığını kontrol eden kodu yazın.
    // Eğer sayı kendisi hariç pozitif bölenlerinin toplamına eşitse bu sayı mükemmel sayıdır.

    // (EN) Write the code that checks if the given number is a perfect number.
    // If the number is equal to the sum of its positive divisors excluding itself, it is a perfect number.

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Please input a number to control if it is a perfect number");
        int num = inp.nextInt();

        int sum =0;

        for (int i=num-1; i>0; i--){

            if (num%i==0){

                sum +=i;
            }
        }
        //System.out.println(sum);

        if (sum ==num){
            System.out.println(num + " is a perfect number");
        }else {
            System.out.println(num + " is not a perfect number");
        }






    }


}

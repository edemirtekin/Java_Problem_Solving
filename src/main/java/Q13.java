import java.util.Scanner;

public class Q13 {

    // (TR) Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir method yazınız.
    // (EN) Write a method that returns true when a number is prime and false otherwise.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter the number you want to check.");

        int x=inp.nextInt();

        System.out.println(isPrime(x));


    }

    public static boolean isPrime(int a){

        Scanner inp=new Scanner(System.in);
        int counter=0;

        if (a<2){
            System.out.println("There are no prime numbers less than 2. Please enter a prime number greater than 2.");
            int b=inp.nextInt();
            isPrime(b);
            return true;
        }else if (a==2){
            return true;
        } else {
            for (int i=2; i<a; i++){
                if (a%i==0){
                    counter++;
                }
            }
            if (counter>0){
                return false;
            }else return true;

        }

    }

}

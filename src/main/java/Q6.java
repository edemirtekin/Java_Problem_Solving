import java.util.Scanner;

public class Q6 {/*

    (TR) Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    Sayı sisteminde ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
    İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    (EN) Write a Java program to check if a number entered is Ugly Number.
     In the number system, Ugly Number are only positive numbers with prime factors 2, 3 or 5.
     The first 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. As a rule, including 1. */

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int num = 0;

        do {

            System.out.println("Enter a number. Press 0 to exit.");

            num = inp.nextInt();

            if(num==0){
                System.out.println("'" + num + "'" + " is not ugly number.");
            }
            else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num == 1) {
                System.out.println("'" + num + "'" + " is ugly number.");
            }else {
                System.out.println("'" + num + "'" + " is not ugly number.");
            }

        } while (num != 0);
    }
}

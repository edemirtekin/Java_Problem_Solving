import java.util.Scanner;

public class Q3 {

    // (EN) Write a Java program to convert all characters in the entered string to uppercase.
    // (TR) Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Write your sentences");
        String str=inp.nextLine().toUpperCase();
        System.out.println("toUpper:\n" + str);


    }
}

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        // (EN) Write a Java program to convert all characters in the entered string to uppercase.
        // (TR) Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

        Scanner inp=new Scanner(System.in);
        System.out.println("Write your sentences");
        String str=inp.nextLine().toUpperCase();
        System.out.println("toUpper:\n" + str);


    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        // (EN) Write a Java Method to count all vowels in the entered String.
        // (TR) Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Scanner inp=new Scanner(System.in);
        System.out.println("Write your sentences");
        String str=inp.nextLine().toLowerCase();

        // String ==> Array
        String[] arrStr=str.split("");

        //Print Array:
        System.out.println(Arrays.toString(arrStr));

        int counter=0;


        for (String w: arrStr){
            boolean vowel=w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u");
           if (vowel){
               counter++;
           }
        }
        System.out.println("Total Vowel: " + counter);

    }
}

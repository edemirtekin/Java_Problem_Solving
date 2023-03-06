import java.util.Scanner;

public class Q4 {

    // (EN) Write a Java Method to count all vowels in the entered String.
    // (TR) Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.


    public static void main(String[] args) {

        // FIRST WAY/BİRİNCİ YOL

        Scanner inp=new Scanner(System.in);
        System.out.println("Write your sentences");
        String str=inp.nextLine().toLowerCase();

        // String ==> Array
        String[] arrStr=str.split("");

        //Print Array:
        //System.out.println(Arrays.toString(arrStr));

        int counter=0;


        for (String w: arrStr){
            boolean vowel=w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u");
           if (vowel){
               counter++;
           }
        }

        System.out.println("FIRST WAY:");

        System.out.println("Total Vowel: " + counter);

        // SECOND WAY/İKİNCİ YOL

        int numOfVowel=str.replaceAll("[^aeuio]","").length();

        System.out.println("--------------");

        System.out.println("SECOND WAY:");
        System.out.println("Total Vowel: " + numOfVowel);

    }
}

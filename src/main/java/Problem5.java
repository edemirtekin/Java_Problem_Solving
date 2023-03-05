import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {


        /* (TR) Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse ya da
        1 karakterden fazla ise hata mesajı göstersin.

        (EN) Ask the user to enter a letter. If the entered letter is a vowel, it is a vowel,
        if not, let it print the consonant on the screen. If the value entered is not a letter, or
        If it is more than 1 character, show an error message. */



        Scanner inp=new Scanner(System.in);
        String str;

        do {

            System.out.println("Enter a letter. Press 0 to exit.");

            str=inp.next().toLowerCase();

            boolean isCh=str.replaceAll("[a-zA-Z]","").length()>0;

            if (str.length()>1 || isCh){
                System.out.println("Invalid input!");
            } else if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        }while (!str.equals("0"));










    }
}

import java.util.Scanner;

public class Q17 {

    // (TR) Kullanıcıya adı, soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren kodu yaziniz.
    // (EN) Ask the user for their name, surname and credit card numbers and write the code that converts them to the given format.

    public static void main(String[] args) {
        /*
        Input :

        John White

        1234234534561478

        Output :

        J*** W****

        CCN  : **** **** **** 1478   */


        Scanner input=new Scanner(System.in);

        System.out.println("Enter the name and surname information on your credit card");
        String nameSur =input.nextLine();

        System.out.println("Enter your 16-digit credit card number");
        String ccNuFirst =input.nextLine();

        String arr[]= nameSur.trim().replaceAll("\\s+"," ").split(" ");

        String strNameSur ="";

        for (String w: arr){

            strNameSur += w.toUpperCase().charAt(0)+w.substring(1).replaceAll("\\w","*") +" ";
        }
        System.out.println(strNameSur);

        String ccFirstFour = ccNuFirst.substring(0,4).replaceAll("\\d","*");
        String ccSecondFour = ccNuFirst.substring(4,8).replaceAll("\\d","*");
        String ccThirdFour= ccNuFirst.substring(8,12).replaceAll("\\d","*");
        String ccFourthFour = ccNuFirst.substring(12);

        String ccNu = ccFirstFour + " " + ccSecondFour + " " + ccThirdFour + " " + ccFourthFour;
        System.out.println(ccNu);






    }


}

import java.util.Scanner;

public class Q8 {

    // (TR) Kullanıcıdan alınan String cümlesi içerisinde aranan Stringin olup olmadığını kontrol eden kodu yazınız.
    // (EN) Write the code that checks whether the searched String exists in the String sentence received from the user.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz./Please enter a sentence.");
        String str=inp.nextLine();

        System.out.println("Aranan ifadeyi giriniz./Enter the search term.");
        String strSrch=inp.nextLine();

        if (str.contains(strSrch)){
            System.out.println("'" + str + "'" + " contains " + "'" + strSrch + "'");
        } else {
            System.out.println("'" + str + "'" + " not contains " + "'" + strSrch + "'");
        }

    }
}

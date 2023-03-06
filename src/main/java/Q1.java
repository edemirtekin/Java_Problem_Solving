import java.util.Scanner;

public class Q1 {

    // (EN) Write the Java code that deletes the last character of the String received from the user and writes it to the screen.
    // (TR) Kullanıcıdan alınan Stringin son karakterini silip ekrana yazan Java kodunu yazınız.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Write your sentences");
        String userStr=inp.nextLine().trim();

        String strWitOutLsCh=userStr.substring(0,userStr.length()-1);

        System.out.println(strWitOutLsCh);

    }
}

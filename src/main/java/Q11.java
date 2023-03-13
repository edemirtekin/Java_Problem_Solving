import java.util.Scanner;

public class Q11 {

    // (TR) Girilen String değer içinde istenen sıradaki karakteri bulan kodu yazınız.
    // (EN) Write the code that finds the desired character in the entered String value.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str=inp.nextLine().replaceAll(" ","");

        System.out.println("Which character's turn do you want?");
        int ch=inp.nextInt();

        System.out.println("The " + "'" + ch + "'" + "." + " character in sentence " + "-" + str + "-" + " is: " + "#" + str.charAt(ch-1) + "#");

    }
}

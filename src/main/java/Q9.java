import java.util.Scanner;

public class Q9 {

    // (TR) Verilen bir kelimenin palindrome olup olmadığını kontrol eden bir kod yazınız.
    // (EN) Write a code that checks if a given word is a palindrome.

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=inp.nextLine();

        String strReversed="";

        for (int i=str.length()-1; i>=0; i--){

            strReversed+=str.charAt(i);

        }

        if (str.equalsIgnoreCase(strReversed)){
            System.out.println("'" + str + "'" + " is Palindrome");
        }else {
            System.out.println("'" + str + "'" + " is not Palindrome");
        }

        // This is second way to reverse the sentence.

        StringBuilder strStrBldr=new StringBuilder(str);

        String reversedStr=strStrBldr.reverse().toString();

        System.out.println(reversedStr);


    }
}

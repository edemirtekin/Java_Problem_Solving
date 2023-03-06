import java.util.Scanner;

public class Q2 {

    // (EN) Write Java code that compares two entered String data.
    // (TR) Girilen iki String veriyi karşılaştıran Java kodu yazınız.

    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

        System.out.println("enter the first data");
        String firstData= inp.nextLine();

        System.out.println("enter the second data");
        String secondData= inp.nextLine();

        if (firstData.equals(secondData)){
            System.out.println(firstData + "=" + secondData);
        } else {System.out.println(firstData + "!=" + secondData);}
    }
}

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q20 {

    // (TR) Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
    // (EN) Write a program that takes an integer as input and calculates the factorial.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be factored in");
        int num=input.nextInt();

        int mltp =1;
        String serial ="";

        for (int i=num; i>0; i--){

            mltp *=i;
            serial +=num-i+1 + " ";

        }

        String newSerial ="";

        for (int i = 1; i< serial.length(); i++) {

            newSerial = serial.trim().replace(serial.substring(i, i + 1), "*");
        }


        System.out.println(num + "!=" + newSerial + "=" + mltp);

        // With Lambda

        System.out.println("With Lambda: ");

        System.out.println(IntStream.rangeClosed(1, num).reduce(Math::multiplyExact));


    }


}

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {

    // (TR) Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
    // (EN) Write a Java Code that finds the number of elements of the searched value in the Array.

    public static void main(String[] args) {

        int[] arr={12,34,2,77,5,90};

        System.out.println(Arrays.toString(arr));

        Scanner inp = new Scanner(System.in);

        System.out.println("Bulmak istediğiniz elemanı giriniz");

        int num=inp.nextInt();

        boolean isExist=true;
        for (int i=0; i<arr.length; i++){

            if (arr[i]==num){
                System.out.println(i+1 +". eleman");
                break;
            }else {
                isExist=false;
            }
        }

        if (!isExist){
            System.out.println("eleman yok");
        }






    }


}

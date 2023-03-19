import java.util.Arrays;
import java.util.Scanner;

public class Q14 {

    // (TR) Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
    // (EN) Write a method that returns the difference between the largest and smallest number in the given array.

    public static void main(String[] args) {

        int[] arr={10,12,4,35,5,2};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int diff=arr[arr.length-1] - arr[0];

        System.out.println(diff);






    }


}

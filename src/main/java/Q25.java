import java.util.Arrays;

public class Q25 {

    // (TR) // Biri hariç m'den n'ye tüm tek sayıları içeren m'den n'ye kadar bir pozitif tamsayı dizimiz olduğunu
    // varsayalım. Listede eksik olan tek sayıyı bulan bir fonksiyon yazınız.

    // (EN) Assume that we have an array of positive integers from m to n which includes al odd numbers from
    // m to n except one. Write a function that finds the missing odd number in the list.

    public static void main(String[] args) {

        int[] arr={9,7,3};
        Arrays.sort(arr);

        for (int i=0; i< arr.length-1; i++){
            if ((arr[i+1] - arr[i])!=2){
                System.out.println("missing number: " + (arr[i]+2));
            }
        }






    }


}

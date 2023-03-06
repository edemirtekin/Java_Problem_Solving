public class Q10 {

    // (TR) Array deki sayıları toplayan method yazınız.
    // (EN) Write a method that sums the numbers in the Array.

    public static void main(String[] args) {

        Integer [] arr={5,2,4};

        System.out.println(sumArray(arr));

    }

    public static int sumArray(Integer[] array){

        int sum=0;
        for (Integer w: array){
            sum+=w;
        }
        return sum;
    }
}

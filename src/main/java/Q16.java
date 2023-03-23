public class Q16 {

    // (TR) Kullanıcının girdiği sayıyı tersine çeviren bir java kod yazınız.
    // (EN) Write a java code that reverses the number entered by the user.

    public static void main(String[] args) {

        int num=1238;

        String numStr=String.valueOf(num);

        String revNum ="";

        for (int i=numStr.length(); i>0; i--){
            revNum +=numStr.substring(i-1,i);
        }

        int revNumInt = Integer.valueOf(revNum);

        System.out.println(revNumInt);






    }


}

public class Q12 {

    // (TR) String array dizisindeki 4 harfli kelimeleri return eden methodu yazınız.
    // (EN) Write a method that returns the 4-letter words in the string array.

    public static void main(String[] args) {

        String[] arr={"Tomato", "Potato", "Pear", "Kiwi"};

        for (String w: arr){

            if (w.length()==4){
                System.out.println(w);
            }
        }


    }

}

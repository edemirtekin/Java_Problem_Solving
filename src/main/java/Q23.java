import java.util.Arrays;
import java.util.HashMap;

public class Q23 {

    // (TR) Verilen bir cümlede geçen sesli harflerin ayrı ayrı sayısını veren kodu yazınız.
    // (EN) Write the code that gives the individual number of vowels in a given sentence.

    public static void main(String[] args) {

        String str="Learning Java is fun";
        str=str.replaceAll("[^aeiou]","").toLowerCase();
        System.out.println(str);

        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> mp=new HashMap<>();

        for (String w:arr){
            Integer gorunum=mp.get(w);
            if (gorunum==null){
                mp.put(w,1);
            }else {
                mp.put(w,gorunum+1);
            }

        }
        System.out.println(mp);

    }
}

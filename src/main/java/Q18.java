public class Q18 {

    // (TR) Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.
    // (EN) Write code that returns repeating characters in a String.

    public static void main(String[] args) {

        String str = "java is my favorite programming language";
        String recurrent ="";

        for (int i=0; i<str.length(); i++ ){

            boolean s1=str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i));
            boolean s2=!recurrent.contains(str.substring(i,i+1));

            if(s1 && s2){
                recurrent +=str.charAt(i) +" ";
            }
        } System.out.println("recurrent characters: " + recurrent);







    }


}

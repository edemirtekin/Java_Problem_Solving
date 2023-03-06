public class Q7 {

    // (TR) String olarak verilen ifadenin en solunda bulunan rakamı veren method yazınız.
    // (EN) Find the leftmost digit that occurs in a given string.

    public static void main(String[] args) {

        String str=" aLEx 1//- 9 ";

        System.out.println(firstDigit(str));

    }

    public static char firstDigit(String inputString){

        String onlyDigit=inputString.replaceAll("[^0-9]","");
        System.out.println(onlyDigit); // not necessary
        char sonuc= 0;
        try {
            sonuc=onlyDigit.charAt(0);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String rakam içermiyor");
        }
        return sonuc;
    }
}

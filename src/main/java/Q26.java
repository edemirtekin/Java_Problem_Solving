public class Q26 {

    // (TR) Yalnızca 'A' ve 'B' karakterlerinden oluşan bir string ifade olan str verildiğinde, 'A' ve 'B' nin görünüm
    // sayıları arasındaki farkı bulan kodu yazınız.

    // (EN) Given a string str which only consists of characters 'A' and 'B', find the absolute difference
    // between their number of occurrences.

    public static void main(String[] args) {

        String str = "AABAABAA";
        int onlyA = str.replaceAll("B","").length();
        int onlyB = str.replaceAll("A","").length();

        int diff = Math.abs(onlyA-onlyB);

        System.out.println(diff);







    }


}

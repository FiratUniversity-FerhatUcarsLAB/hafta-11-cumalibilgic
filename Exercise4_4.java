public class Exercise44 {

    // ------------------------------
    // 1) Return eden metodu çağırıp sonucu kullanmama
    // ------------------------------

    public static double karekok(double x) {
        return Math.sqrt(x);
    }

    public static void testReturnValue() {

        // Bu satır return değeri üretiyor ama kullanılmıyor — HATA YOK
        karekok(25);

        // Normal kullanım
        double sonuc = karekok(16);
        System.out.println("testReturnValue çıktısı: " + sonuc);
    }



    // ------------------------------
    // 2) Void metodu ifadede kullanmak (DERLEME HATASI)
    // ------------------------------

    public static void selam() {
        System.out.println("Merhaba!");
    }

    public static void testVoidInExpression() {

        // Bu satır DERLEME HATASI verir.
        // Açıklama satırı olarak bırakıyorum, yoksa proje compile olmaz.

        // System.out.println(selam() + " test");

        // Derleme hatası:
        // bad operand type void for binary operator '+'
    }



    // ------------------------------
    // MAIN — her şeyi buradan test edebilirsin
    // ------------------------------

    public static void main(String[] args) {

        System.out.println("---- TEST 1: Return değeri kullanılmayan metot ----");
        testReturnValue();

        System.out.println("\n---- TEST 2: Void metodu ifadede kullanma (kodu açarsan HATA verir) ----");
        // testVoidInExpression(); // uncomment edersen derleme hatası alırsın!
    }

}

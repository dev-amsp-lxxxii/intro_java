
public class PromocoesAutomaticas {

    public static void main(String[] args) {
        byte aByte = 10;
        int bInt = aByte + 5; // aByte é promovido para int antes do cálculo
        System.out.println(bInt);

        int aInt = 10;
        long bLong = 15L;
        long cLong = aInt + bLong; // aInt é promovido para Long antes do cálculo
        System.out.println(cLong);

        float bFloat = 1.5f;
        float cFloat = aInt * bFloat; // aInt é promovido para float antes do cálculo
        System.out.println(cFloat);

        double bDouble = 2.5;
        double cDouble = aInt * bDouble; // aInt é promovido para double antes do cálculo
        System.out.println(cDouble);
    }
}

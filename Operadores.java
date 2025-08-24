
public class Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int aOpAri = 10;
        int bOpAri = 2;

        System.out.println(aOpAri + bOpAri);
        System.out.println(aOpAri - bOpAri);
        System.out.println(aOpAri * bOpAri);
        System.out.println(aOpAri / bOpAri);
        System.out.println(aOpAri % bOpAri);

        // Operadores de Compraração
        int aOpComp = 10;
        int bOpComp = 20;

        System.out.println(aOpComp == bOpComp);
        System.out.println(aOpComp != bOpComp);
        System.out.println(aOpComp > bOpComp);
        System.out.println(aOpComp < bOpComp);
        System.out.println(aOpComp >= bOpComp);
        System.out.println(aOpComp <= bOpComp);

        // Operadores Lógicos
        int aOpLo = 10;
        int bOpLo = 20;
        boolean cOpLo = true;

        System.out.println(aOpLo < bOpLo && cOpLo);
        System.out.println(aOpLo > bOpLo || cOpLo);
        System.out.println(!cOpLo);

        // Operadores de Atribuição = += -= *= /= %=
        int aOpAtri = 10;
        aOpAtri += 2; // Equivalente a aOpAtri = aOpAtri + 2

        System.out.println(aOpAtri);
    }

}

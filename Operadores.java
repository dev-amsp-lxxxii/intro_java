
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

        // Operadores Unários
        int aOpUn = 10;
        aOpUn++;
        System.out.println(aOpUn);
        /* 
        Pré-incremento int b = ++a; // Agora, a é 6 e b também é 6
        Pós-incremento int c = a++; // Agora, a é 7, mas c é 6 
        (porque o valor antigo de a foi usado)
        Pré-decremento int d = --a; // Agora, a é 6 e d também é 6
        Pós-decremento int e = a--; // Agora, a é 5, mas e é 6 
        (porque o valor antigo de a foi usado)
         */
    }

}

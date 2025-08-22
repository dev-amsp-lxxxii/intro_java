public class InferenciaVariaveisLocais {
    public static void main(String[] args) {
        var numInt = 10; // inferêrencia do tipo int
        var numDouble = 10.5; // inferêrencia do tipo double
        var numFloat = 10.15f;
        var numLong = 19L;
        // var usuario = new Usuario(); // inferêrencia do tipo Usuário

        System.out.println(((Object) numInt).getClass().getName());
        // System.out.println(numDouble);
        System.out.println(((Object) numDouble).getClass().getName());
        System.out.println(((Object) numFloat).getClass().getName());
        System.out.println(((Object) numLong).getClass().getName());
    }
}

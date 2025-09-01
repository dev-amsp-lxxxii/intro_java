
public class Funcionario {

    String nome;
    String cargo;
    int idade;

    // Construtor default explicito
    // Este contrutor é criando implícitamente.
    Funcionario() {
    }

    // Este é o contrutor
    Funcionario(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Adelmo";
        funcionario01.cargo = "Desenvolvimento";
        funcionario01.idade = 43;

        Funcionario funcionario02 = new Funcionario("Marta", "RH", 55);

        System.out.println("Nome: " + funcionario01.nome);
        System.out.println("Cargo: " + funcionario01.cargo);
        System.out.println("Idade: " + funcionario01.idade);
    }
}

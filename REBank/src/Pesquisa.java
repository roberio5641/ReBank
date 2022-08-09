import java.util.Scanner;

public class Pesquisa {
    private String nome;
    public String Pesquisar() {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Insira o nome do pokemon: ");
        nome = prompt.next();

        return nome;

    }

    public Pesquisa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pesquisa: " + "\n" +
                "nome: " + nome;
    }
}

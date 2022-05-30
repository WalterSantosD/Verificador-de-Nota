import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;

    ArrayList<Double> notasParcial = new ArrayList<Double>();
    ArrayList<Double> notasBimestral = new ArrayList<Double>();

    private int quantidadeNotasParcial;
    private int quantidadeNotasBimestral;
    //private File arquivo =  new FileReader("src\ArquivoDeTeste.txt").useDelimiter("\\\\||\\\\n");
    Scanner sc = new Scanner(new FileReader("ArquivoDeTeste.txt")).useDelimiter("\\\\||\\\\n");  
    private Nota nota = new Nota();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Nota getNota() {
        return nota;
    }

    public Aluno(int quantidadeNotasParcial, int quantidadeNotasBimestral) {
        this.quantidadeNotasParcial = quantidadeNotasParcial;
        this.quantidadeNotasBimestral = quantidadeNotasBimestral;

        System.out.println("Deseja alterar os parâmetros? (S)sim (N)Não");
        if (sc.next().equalsIgnoreCase("S")) {
            nota.definirSistema(sc);
        }
    }

    public int getQuantidadeNotasBimestral() {
        return quantidadeNotasBimestral;
    }

    public int getQuantidadeNotasParcial() {
        return quantidadeNotasParcial;
    }

    public void registrarNotas(Aluno aluno) {
        for (int i = 0; i < aluno.getQuantidadeNotasParcial(); i++) {
            System.out.println("Nota parcial AV" + (i + 1));
            aluno.notasParcial.add(sc.nextDouble());
        }
        for (int i = 0; i < aluno.getQuantidadeNotasBimestral(); i++) {
            System.out.println("Nota bimestral AV" + (i + 1));
            aluno.notasBimestral.add(sc.nextDouble());

        }
    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class Aluno  {
    private String nome;
    private int matricula;

    ArrayList<Double> notasParcial = new ArrayList<Double>();
    ArrayList<Double> notasBimestral = new ArrayList<Double>();

    private int quantidadeNotasParcial;
    private int quantidadeNotasBimestral;
    //private File arquivo =  new FileReader("src\ArquivoDeTeste.txt").useDelimiter("\\\\||\\\\n");
    Scanner sc = new Scanner(System.in);  
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

    public Aluno() {
        this.quantidadeNotasParcial = 2;
        this.quantidadeNotasBimestral = 1;
    }

    public void mudarParametros() {
        System.out.println("Quantida de Notas Parcial?");
        this.quantidadeNotasParcial = sc.nextInt();
        System.out.println("Quantidade Notas Bimestral?");
        this.quantidadeNotasBimestral = sc.nextInt();
        nota.definirSistema(sc);
    }

    public int getQuantidadeNotasBimestral() {
        return quantidadeNotasBimestral;
    }

    public int getQuantidadeNotasParcial() {
        return quantidadeNotasParcial;
    }

    public void registrarNotas(Aluno aluno) {
        ValidadorNota validadorNota = new ValidadorNota();
        for (int i = 0; i < aluno.getQuantidadeNotasParcial(); i++) {

            System.out.println("Nota parcial AV" + (i + 1));
            String x = sc.next();
            if (validadorNota.NotaENumero(x)) {
                Double y = Double.parseDouble(x);
                aluno.notasParcial.add(y);
            } else {
                throw new NotaInvalida();
            }
            
        } 
        for (int i = 0; i < aluno.getQuantidadeNotasBimestral(); i++) {
            System.out.println("Nota bimestral AV" + (i + 1));

            String x = sc.next();
            if (validadorNota.NotaENumero(x)) {
                Double y = Double.parseDouble(x);
                aluno.notasBimestral.add(y);
            } else {
                throw new NotaInvalida();
            }
        }
    }

    @Override
    public String toString() {
        System.out.println();
        StringBuilder builder = new StringBuilder("[");
        builder.append("Matricula: " + this.matricula + " | Aluno: " + this.nome);
        builder.append("]\n");
       
        
        
        return builder.toString();
    }
    
    

}

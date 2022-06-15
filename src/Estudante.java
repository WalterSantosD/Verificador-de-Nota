import java.util.ArrayList;

public abstract class  Estudante {
     
    private String nome;
    private int matricula;
    private int quantidadeNotasParcial;
    private int quantidadeNotasBimestral;

    ArrayList<Double> notasParcial = new ArrayList<Double>();
    ArrayList<Double> notasBimestral = new ArrayList<Double>();
    ArrayList<Double> notasFinal = new ArrayList<Double>();

    public abstract String getNome();  

    public abstract void setNome(String nome);

    public abstract int getMatricula();

    public abstract void setMatricula(int matricula);

    public abstract int getQuantidadeNotasBimestral(); 

    public abstract int getQuantidadeNotasParcial();

  

}

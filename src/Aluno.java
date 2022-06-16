import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Estudante {
    Scanner sc = new Scanner(System.in);
    
    private String nome;
    private int matricula;
    private int quantidadeNotasParcial;
    private int quantidadeNotasBimestral;
    private NotaParametro nota = new NotaParametro();
    private String matéria;

    ArrayList<Double> notasParcial = new ArrayList<Double>();
    ArrayList<Double> notasBimestral = new ArrayList<Double>();
    ArrayList<Double> notasFinal = new ArrayList<Double>();
   
    //private File arquivo =  new FileReader("src\ArquivoDeTeste.txt").useDelimiter("\\\\||\\\\n");
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int getMatricula() {
        return matricula;
    }
    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMateria(String matéria) {
        this.matéria = matéria;
    }
   
    public NotaParametro getNota() {
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

    public void validadorMatricula(int numero)  {
        if (numero < 0) {
            try {
                throw new MatriculaExeception();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Digite novamente a matrícula");
                validadorMatricula(sc.nextInt()); 
            }
            
        } else {
            setMatricula(numero);
        }
        
    }

    public void registrarNotas(Aluno aluno) {
        ValidadorNota validadorNota = new ValidadorNota();
        CalculadorNota calculadorNota = new CalculadorNota();
        for (int i = 0; i < aluno.getQuantidadeNotasParcial(); i++) {

            System.out.println("Nota parcial AV" + (i + 1));
            String x = sc.next();
            if (validadorNota.NotaENumero(x)) {
                Double y = Double.parseDouble(x);
                aluno.notasParcial.add(y);
               
            } else {
                throw new NotaInvalidaExeception();
            }

        }
        for (int i = 0; i < aluno.getQuantidadeNotasBimestral(); i++) {
            System.out.println("Nota bimestral AV" + (i + 1));

            String x = sc.next();
            if (validadorNota.NotaENumero(x)) {
                Double y = Double.parseDouble(x);
                aluno.notasBimestral.add(y);

            } else {
                throw new NotaInvalidaExeception();
            }
        }
        if(calculadorNota.resultadoNotas(aluno, validadorNota)){
            Double x = calculadorNota.calcularNF(aluno);
            this.notasFinal.add(x);
        } else {
            Double x = calculadorNota.getParcial();
            this.notasFinal.add(x);
        }      
    }
    

    @Override
    public String toString() {
    
        System.out.println();
        StringBuilder builder = new StringBuilder("[");
        builder.append("Matricula: " + this.matricula + " | Aluno: " + this.nome+" | Notas Parcial: "+ this.notasParcial+" | Notas Bimestral: "+ this.notasBimestral +" | Nota Final: "+this.notasFinal+" | Matéria: "+this.matéria);
        builder.append("]\n");
       
        
        
        return builder.toString();
    }
    
    

}

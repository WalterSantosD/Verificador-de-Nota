import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro implements CadastroGeral {
    Scanner sc = new Scanner(System.in);  
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Map<Integer, Aluno> matriculaAluno = new HashMap<>();

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        matriculaAluno.put(aluno.getMatricula(), aluno);
    }

    @Override
    public void cadastrarVariosAlunos() {
        System.out.println("Quantos Alunos?");
        int numeroAlunos = sc.nextInt();
        for (int i = 0; i < numeroAlunos; i++) {
            Aluno aluno = new Aluno();
            /*  aluno.mudarParametros(); */
            System.out.println("Nome do aluno?");
            aluno.setNome(sc.next());

            System.out.println("Matricula do aluno?");
            int x = sc.nextInt();
            aluno.validadorMatricula(x);
            
           

            Materias materias = new Materias();

            aluno.setMateria(materias.escolherMateria(sc));
            aluno.registrarNotas(aluno);

            ValidadorNota validadorNota = new ValidadorNota();
            validadorNota.validadorGeralNota(aluno);
            alunos.add(aluno);
            matriculaAluno.put(aluno.getMatricula(), aluno);
        }
    }
    
    @Override
    public void buscarAlunosNome(String nomeAluno) {

        for (int i = 0; i < alunos.size(); i++) {

            if (alunos.get(i).getNome().equals(nomeAluno)) {
                //System.out.print(alunos.get(i).getMatricula() + " ");
                //System.out.println(alunos.get(i).getNome());
                Object x = buscarAlunosMatricula(alunos.get(i).getMatricula());
                if (x == null) {
                    System.out.println("Aluno não encontrado por nome");
                } else {
                    System.out.println(x);
                }
                
               
            }
        }
        
    }
    
    @Override
    public Aluno buscarAlunosMatricula(int matricula) {
        if (matriculaAluno.get(matricula) == null) {
            try {
                throw new AlunoException();
            } catch (AlunoException e) {
                System.out.println(e.getMessage());
            }

        }
        return matriculaAluno.get(matricula);
    }
    
    @Override
    public void alunosCadastrados() {
        System.out.println(alunos);
    }

    public void rank() {
        double contador = 0;
        Object aluno = 0;
        for (int i = 0; i < alunos.size(); i++) {

            if (contador < alunos.get(i).notasFinal.get(0)) {
                contador = alunos.get(i).notasFinal.get(0);
                aluno = alunos.get(i);
                

            }
            if (i + 1 >= alunos.size()) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Aluno com a melhor nota:");
                System.out.println(aluno);
                System.out.println("--------------------------------------------------------------------");
        
            }
        }
        
       
    }
   
    
}
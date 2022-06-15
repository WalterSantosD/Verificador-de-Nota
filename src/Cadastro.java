import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);  
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Map<Integer, Aluno> matriculaAluno = new HashMap<>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        matriculaAluno.put(aluno.getMatricula(), aluno);
    }

    public void cadastrarVariosAlunos() {
        System.out.println("Quantos Alunos?");
        int numeroAlunos = sc.nextInt();
        for (int i = 0; i < numeroAlunos; i++) {
            Aluno aluno = new Aluno();
           /*  aluno.mudarParametros(); */
            System.out.println("Nome do aluno?");
            aluno.setNome(sc.next());

            System.out.println("Matricula do aluno?");
            aluno.setMatricula(sc.nextInt());

            Materias materias = new Materias();
            
            aluno.setMateria(materias.escolherMateria(sc));
            aluno.registrarNotas(aluno);

            ValidadorNota validadorNota = new ValidadorNota();
            validadorNota.validadorGeralNota(aluno);
            alunos.add(aluno);
            matriculaAluno.put(aluno.getMatricula(), aluno);
        }
    }

    public void buscarAlunosNome(String nomeAluno) {
        
        for (int i = 0; i < alunos.size(); i++) {

            if (alunos.get(i).getNome().equals(nomeAluno)) {
                //System.out.print(alunos.get(i).getMatricula() + " ");
                //System.out.println(alunos.get(i).getNome());
                Object x = buscarAlunosMatricula(alunos.get(i).getMatricula());
                System.out.println(x); 
            }
        }
    }

    public Aluno buscarAlunosMatricula(int matricula){
        if (matriculaAluno.get(matricula) == null) {
            try {
                throw new AlunoException(); 
            } catch (AlunoException e) {
                System.out.println(e.getMessage()); 
            }
            
        }
        return matriculaAluno.get(matricula);
    }

    public void alunosCadastrados() {
        System.out.println(alunos);
    }
   


}
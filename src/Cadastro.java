import java.util.ArrayList;

public class Cadastro {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void buscarAlunosNome(String nomeAluno) {
        System.out.println(alunos.size());
        for (int i = 0; i < alunos.size(); i++) {

            if (alunos.get(i).getNome().equals(nomeAluno)) {
                System.out.print(alunos.get(i).getMatricula()+" ");
                System.out.println(alunos.get(i).getNome());
                //return alunos.get(i).getNome();
            }
        }
    
    }

}
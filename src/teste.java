public class teste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.setNome("Pedro");
        aluno01.setMatricula(1);

        Aluno aluno02 = new Aluno();
        aluno02.setNome("lucas");
        aluno02.setMatricula(2);

         Aluno aluno03 = new Aluno();
         aluno03.setNome("walter");
         aluno03.setMatricula(3);

         Aluno aluno04 = new Aluno();
         aluno04.setNome("lucas");
         aluno04.setMatricula(4);



        Cadastro cadastro = new Cadastro();
        cadastro.cadastrarAluno(aluno01);
        cadastro.cadastrarAluno(aluno02);
        cadastro.cadastrarAluno(aluno03);
        cadastro.cadastrarAluno(aluno04);

        cadastro.cadastrarVariosAlunos();

        cadastro.buscarAlunosNome("lucas");
        System.out.println("");
        System.out.println(cadastro.buscarAlunosMatricula(5)); 
        
        cadastro.alunosCadastrados();
    }
}

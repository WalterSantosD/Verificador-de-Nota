public class teste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(2, 3);
        aluno01.setNome("Pedro");
        aluno01.setMatricula(1);

        Aluno aluno02 = new Aluno(2, 3);
        aluno02.setNome("lucas");
        aluno02.setMatricula(2);

         Aluno aluno03 = new Aluno(2, 3);
         aluno03.setNome("walter");
         aluno03.setMatricula(3);

         Aluno aluno04 = new Aluno(2, 3);
         aluno04.setNome("lucas");
         aluno04.setMatricula(4);


        Cadastro cadastro = new Cadastro();
        cadastro.cadastrarAluno(aluno01);
        cadastro.cadastrarAluno(aluno02);
        cadastro.cadastrarAluno(aluno03);
        cadastro.cadastrarAluno(aluno04);

        cadastro.buscarAlunosNome("lucas");
    }
}

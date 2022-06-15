public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        
        cadastro.cadastrarVariosAlunos();

        cadastro.buscarAlunosNome("lucas");
   
        System.out.println(cadastro.buscarAlunosMatricula(5)); 
        
        cadastro.alunosCadastrados();
    }
}

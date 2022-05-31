public class Main {
    public static void main(String[] args) {
          
        Aluno aluno = new Aluno();
        
        aluno.registrarNotas(aluno);

        ValidadorNota validadorNota = new ValidadorNota();

        CalculadorNota calculadorNota = new CalculadorNota();

        calculadorNota.resultadoNotas(aluno, validadorNota);
        
    }
}

public interface CaluladorNotaGeral {
    
    public double calcularNotaParcial(Aluno aluno);

    public double calcularNotaBimestral(Aluno aluno);

    public double calcularNF(Aluno aluno);

    public boolean resultadoNotas(Aluno aluno, ValidadorNota validadorNota);
}

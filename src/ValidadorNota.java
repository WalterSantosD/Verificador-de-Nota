public class ValidadorNota {

    private boolean NotaValida(double Nota) {
        if (Nota >= 0.0 && Nota <= 10.0) {
            return true;
        } else {
            return false;
        }
    }

    // @return

    boolean NotaENumero(String Nota) {
        // String x = Double.toString(Nota);
        String condicao = "[+]?\\d*\\d*";
        if (Nota.matches(condicao)) {
            return true;
        }
        return false;
    }

    public boolean validadorGeralNota(Aluno aluno) {
        for (int i = 0; i < aluno.getQuantidadeNotasParcial(); i++) {
            if (!NotaValida(aluno.notasParcial.get(i))) {
                throw new NotaInvalida();
            }
        }
        for (int i = 0; i < aluno.getQuantidadeNotasBimestral(); i++) {
            if (!NotaValida(aluno.notasBimestral.get(i))) {
                throw new NotaInvalida();
            }
        }
        return true;
    }
}

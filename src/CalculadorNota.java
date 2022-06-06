public class CalculadorNota {
    private double parcial;
    private double bimestral;
    private double nf;

    public double getParcial() {
        return parcial;
    }

    public double getBimestral() {
        return bimestral;
    }

    public double getNF() {
        return nf;
    }

    public double calcularNotaParcial(Aluno aluno) {
        for (int i = 0; i < aluno.notasParcial.size(); i++) {

            if (i + 1 >= aluno.notasParcial.size()) {

                if (aluno.notasParcial.size()%2 == 0) {
                    this.parcial = this.parcial / aluno.notasParcial.size();
                    break;

                } else {
                    this.parcial += aluno.notasParcial.get(i);

                    this.parcial = this.parcial / aluno.notasParcial.size();
                    break;
                }
            }


            this.parcial += (aluno.notasParcial.get(i) + aluno.notasParcial.get(i + 1));
            
        }

        return parcial;
    }

    public double calcularNotaBimestral(Aluno aluno) {
        for (int i = 0; i < aluno.notasBimestral.size(); i++) {

            if (i + 1 >= aluno.notasBimestral.size()) {

                if (aluno.notasBimestral.size() % 2 == 0) {
                    this.bimestral = this.bimestral / aluno.notasBimestral.size();
                    break;

                } else {
                    this.bimestral += aluno.notasBimestral.get(i);

                    this.bimestral = this.bimestral / aluno.notasBimestral.size();
                    break;
                }
            }

            this.bimestral += (aluno.notasBimestral.get(i) + aluno.notasBimestral.get(i + 1));
        
        }
        return bimestral;
    }

    public double calcularNF(Aluno aluno) {
        
        this.nf += this.parcial + this.bimestral / aluno.notasParcial.size() + aluno.notasBimestral.size();
        return nf;
    }


    public void resultadoNotas(Aluno aluno, ValidadorNota validadorNota) {
        if (validadorNota.validadorGeralNota(aluno)) {

            calcularNotaParcial(aluno);
            if (this.getParcial() >= aluno.getNota().getMinParcial()) {
                System.out.println("Pode fazer Bimestral");

                calcularNotaBimestral(aluno);
                calcularNF(aluno);
                if (this.getNF() >= aluno.getNota().getMinNF() && this.bimestral >= aluno.getNota().getMinBimestral()) {
                    System.out.println("Aprovado no semestre");

                } else if (this.getNF() < aluno.getNota().getMinNF()) {
                    System.out.println("Reprovado no semestre, NF: " + this.getNF());

                } else if (this.bimestral < aluno.getNota().getMinBimestral()) {
                    System.out.println("Reprovado no semestre, NF: " + this.getNF() + ", Bimestral abaixo do permitido: 4.0");

                }
            } else {
                System.out.println("Não pode fazer Bimestral, Parcial abaixo do permitido: " + this.getParcial());
            }

        }
    }
}

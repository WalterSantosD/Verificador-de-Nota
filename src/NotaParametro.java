import java.util.Scanner;

public class  NotaParametro {
    private double minParcial;
    private double minBimestral;
    private double minNF;
    

    public NotaParametro() {
        this.minParcial = 4;
        this.minBimestral = 4;
        this.minNF = 5;
    }

    public double getMinParcial() {
        return minParcial;
    }
  
    public double getMinBimestral() {
        return minBimestral;
    }

    public double getMinNF() {
        return minNF;
    }
   
    public void definirSistema(Scanner sc) {
        System.out.println("Defina o mínimo para a Parcial ");
        this.minParcial = sc.nextDouble();
        System.out.println("Defina o mínimo para Bimestral");
        this.minBimestral = sc.nextDouble();
        System.out.println("Defina o mínimo para NF");
        this.minNF = sc.nextDouble();
    } 


}

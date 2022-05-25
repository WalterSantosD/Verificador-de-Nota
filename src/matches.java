import java.util.Scanner;

public class matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ENumero = sc.next();
        String CPF = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
        String CPF02 = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
        String CPF03 = "[+-]?\\d*";
        boolean resultado = ENumero.matches(CPF03);
        //"[+-]?\\d*(\\.\\d+)?"
       /*  try {
            double resultado = Double.parseDouble(ENumero);
            System.out.println("Numero valido");
        } catch (NumberFormatException  e) {
            System.out.println("Numero Invalido");
        } */
        
        System.out.println(resultado);
    }
}

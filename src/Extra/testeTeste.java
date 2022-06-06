package Extra;
import java.util.Scanner;

public class testeTeste {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String Nota = sc.nextLine();


            String condicao01 = "[+-]?\\d*\\d*";
            String condicao02 = "\\d*\\d*";
            if (Nota.matches(condicao01)) {
                System.out.println("sim");
            } else {
                System.out.println("nao"); 
            }
           
        
    }
}

import java.util.Scanner;

public class testeTeste {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String Nota = sc.nextLine();


            String condicao = "[+-]?\\d*.\\d*.";
            if (Nota.matches(condicao)) {
                System.out.println("sim");
            } else {
                System.out.println("nao"); 
            }
           
        
    }
}

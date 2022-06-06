import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Extra.matches;

public class InterfaceGrafica {
    
    public static void main(String[] args) {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        Map<Integer, Object> lista = new HashMap<>();
        

        lista.put(0, new Aluno());
        lista.put(0, new matches());
        lista.put(0, new matches());
        lista.put(0, new matches());

       


        escolha = sc.nextInt();
        while (escolha < 0 || escolha > 4) {
            System.out.println("Escolha invalida ");
            escolha = sc.nextInt();
        }
        
        
        sc.close();
    }
}

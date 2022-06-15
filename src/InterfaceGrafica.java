import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Extra.matches;

public class InterfaceGrafica {
    
    public static void main(String[] args) {
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        Map<Integer, Object> lifsta = new HashMap<>();
        ArrayList<String> lista = new ArrayList<>();
       
       

        lista.add("Cadastrar varios alunos");
        lista.add("Buscar aluno por nome");

       

        System.out.println("Escolha um opção");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("["+i+"] "+lista.get(i)); 
        }
        escolha = sc.nextInt();

        while (escolha < 0 || escolha >= lista.size()) {
            System.out.println("Escolha invalida ");
            
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("[" + i + "] " + lista.get(i));
            }
            
            escolha = sc.nextInt();
        }
        if(escolha == 0){
            Cadastro cadastro = new Cadastro();
            cadastro.cadastrarVariosAlunos();
        } else if (escolha == 1) {
            
        }
        
        sc.close();
    }
}

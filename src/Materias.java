import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Materias {

 Map<Integer, String> materias = new HashMap<>();


 public Materias() {
     materias.put(0, "História");
     materias.put(1, "Matemática");
     materias.put(2, "Língua Portuguesa");
     materias.put(3, "Física");
     materias.put(4, "Biologia");
     materias.put(5, "Química");
     materias.put(6, "Filosofia");
     materias.put(7, "Artes");
     materias.put(8, "Geografia");
     materias.put(9, "Redação");
     materias.put(10, "Sociologia");
 }
    
 public void cadastrarNovaMateria(String materia) {
     materias.put(materias.size(), materia);
 }

 public String escolherMateria(Scanner sc) {
    System.out.println("Escolha uma matéria: ");
     for (int i = 0; i < materias.size(); i++) {
        System.out.println("["+i+"]"+materias.get(i));
     }
    return materias.get(sc.nextInt());
 }
    
}


import java.util.Scanner;
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author Thauany Azevedo Bastos 
 * @version 1.0
 * @since 01/06/2020 - 10:13
 * @category View
 */
public class Principal {
     public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Nadador nadador = new Nadador();     
       
       System.out.println("Digite o nome do nadador: ");
       nadador.setNome(scanner.next());
       System.out.println("Digite a idade do nadador: ");
       nadador.setIdade(scanner.nextInt());
       nadador.verificarNadador();
       System.out.println(nadador);
       
   }
}

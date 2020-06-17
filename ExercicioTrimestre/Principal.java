import java.util.Scanner;
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author Thauany Azevedo Bastos
 * @version 1.0
 * @since 01/06/2020 - 09:10
 * @category View
 */

public class Principal {
    
    public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Trimestre trimestre = new Trimestre();     
       
       System.out.println("Digite o mês que nasceu: ");
       trimestre.setMes(scanner.nextInt());
       System.out.println(trimestre);
       
   }
}

import java.util.Scanner;
public class Principal {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Morango morango = new Morango();
        System.out.println("Digite a cor do morango");
        morango.setCor(scanner.next());
        morango.comer();
        morango.retirarCasca();
        System.out.println(morango);
        
        Abacate abacate = new Abacate();
        System.out.println("Digite a cor do abacate");
        abacate.setCor(scanner.next());
        abacate.comer();
        abacate.retirarCasca();
        System.out.println(abacate);
        
        Abacaxi abacaxi = new Abacaxi();
        System.out.println("Digite a cor do abacaxi");
        abacaxi.setCor(scanner.next());
        abacaxi.comer();
        abacaxi.retirarCasca();
        System.out.println(abacaxi);
    }
}
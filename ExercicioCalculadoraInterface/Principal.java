public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(5);
        calculadora.setNumero2(5);
        calculadora.somar();
        calculadora.subtrair();
        calculadora.multiplicar();
        calculadora.dividir();
        System.out.println(calculadora);
        
        Calculadora calculadora2 = new Calculadora();
        calculadora2.setNumero1(30);
        calculadora2.setNumero2(55);
        calculadora2.somar();
        calculadora2.subtrair();
        calculadora2.multiplicar();
        calculadora2.dividir();
        System.out.println(calculadora2);
    }
}
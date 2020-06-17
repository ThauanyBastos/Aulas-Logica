public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.numero1 = 10;
        calculadora.numero2 = 5;
        
        System.out.println("Numero 1: " + calculadora.numero1
                         + "\nNumero 2: " + calculadora.numero2
                         + "\nSoma: " + calculadora.calcularSoma()
                         + "\nSubtração: " + calculadora.calcularSubtracao()
                         + "\nDivisão: " + calculadora.calcularDivisao()
                         + "\nMultiplicação: " + calculadora.calcularMultiplicacao()
                         + "\nRaiz quadrada do número 1: " + calculadora.calcularRaizQuadradaDoNumero1()
                         + "\nPotência do número 1: " + calculadora.calcularPotenciaDoNumero1()
                         + "\nPotência do número 2: " + calculadora.calcularPotenciaDoNumero2(2));
    }
}
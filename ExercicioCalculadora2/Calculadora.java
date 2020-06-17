public class Calculadora {

    double numero1;
    double numero2;
    
    public double calcularSoma() {
        return this.numero1 + this.numero2;
    }
    
    public double calcularSubtracao() {
        return this.numero1 - this.numero2;
    }
    
    public double calcularDivisao() {
        return this.numero1 / this.numero2;
    }
    
    public double calcularMultiplicacao() {
        return this.numero1 * this.numero2;
    }
    
    public double calcularRaizQuadradaDoNumero1() {
        return Math.sqrt(this.numero1);
    }
    
    public double calcularPotenciaDoNumero1() {
        return Math.pow(this.numero1, 2);
    }
    
    public double calcularPotenciaDoNumero2(int expoente) { 
        return Math.pow(this.numero2, expoente);
    }
}
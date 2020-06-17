public class Numero {

   private double numero1;
   private double numero2;
   private double numero3;
   
   public double getNumero1() {
       return this.numero1;
   }
   
   public void setNumero1(double numero1) {
       this.numero1 = numero1;
   }
   
   public double getNumero2() {
       return this.numero2;
   }
   
   public void setNumero2(double numero2) {
       this.numero2 = numero2;
   } 
   
   public double getNumero3() {
       return this.numero3;
   }
   
   public void setNumero3(double numero3) {
       this.numero3 = numero3;
   } 
   
   public double calcularSoma() {
       return this.numero1 + this.numero2 + this.numero3;
   }
   
   public double calcularSubtracao() {
       return this.numero1 - this.numero2 - this.numero3;
   }
   
   public double calcularMultiplicacao() {
       return this.numero1 * this.numero2 * this.numero3;
   }
   
   @Override
   public String toString() {
       return "Numero 1: " + this.getNumero1()
            + "\nNumero 2: " + this.getNumero2()
            + "\nNumero 3: " + this.getNumero3()
            + "\nSoma: " + this.calcularSoma()
            + "\nSubtração: " + this.calcularSubtracao()
            + "\nMultiplicação: " + this.calcularMultiplicacao();
   } 
       
}
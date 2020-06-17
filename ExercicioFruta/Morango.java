public class Morango extends Fruta {
    
    public Morango() {
        super();
    }
    
    @Override
    public String comer() {
        return "azedo";
    }
    
    @Override
    public String retirarCasca() {
        return "não tem casca";
    }
    
    @Override 
    public String toString() {
        return "Cor: " + this.cor
             + "\nComer: " + this.comer()
             + "\nRetirar a casca: " + this.retirarCasca();
    }
}
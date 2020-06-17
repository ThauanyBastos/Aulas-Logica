public class Abacate extends Fruta {
    
    public Abacate() {
        super();
    }
    
    @Override
    public String comer() {
        return "Doce";
    }
    
    @Override
    public String retirarCasca() {
        return "Cortando";
    }
    
    @Override 
    public String toString() {
        return "Cor: " + this.cor
             + "\nComer: " + this.comer()
             + "\nRetirar a casca: " + this.retirarCasca();
    }
}
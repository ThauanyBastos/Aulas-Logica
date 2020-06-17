public class Gato extends Animal {
    
    private String ronronado;
    private String presa;
    private String garras;
    
    public Gato() {
        super();
    }
    
    public Gato(String nome, int idade, String ronronado, String presa, String garras) {
        this.nome = nome;
        this.idade = idade;
        this.ronronado = ronronado;
        this.presa = presa;
        this.garras = garras;
    }
    
    public String getRonronado() {
        return this.ronronado;
    }
    
    public void setRonronado(String ronronado) {
        this.ronronado = ronronado;
    }
    
    public String getPresa() {
        return this.presa;
    }
    
    public void setPresa(String presa) {
        this.presa = presa;
    }
    
    public String getGarras() {
        return this.garras;
    }
    
    public void setGarras(String garras) {
        this.garras = garras;
    }
    
    public double calcularIdadeEmDias() {
        return this.idade * 365;
    }
    
    public String emitirMiado() {
        return "Miaau";
    }
    
    @Override
    public String toString() {
        return "toString Gato"
             + "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nRonronado: " + this.ronronado
             + "\nPresa: " + this.presa
             + "\nGarras: " + this.garras
             + "\nMiado: "+ this.emitirMiado()
             + "\nIdade em dias: " + this.calcularIdadeEmDias();
    }
}
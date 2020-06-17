public class Cachorro extends Animal {
    
    private String porte;
    private String raca;
    private String pelagem;
    
    public Cachorro() {
        super();
    }
    
    public Cachorro(String nome, int idade, String porte, String raca, String pelagem) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.raca = raca;
        this.pelagem = pelagem;
    }
    
    public String getPorte() {
        return this.porte;
    }
    
    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public String getPelagem() {
        return this.pelagem;
    }
    
    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    
    public double calcularIdadeEmIdadeDeCachorro() {
        return this.idade * 7;
    }
    
    public String emitirLatido() {
        return "au au";
    }
    
    @Override
    public String toString() {
        return "toString Cachorro"
             + "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nPorte: " + this.porte
             + "\nRaça: " + this.raca
             + "\nPelagem: " + this.pelagem
             + "\nIdade em dias de cachorro: " + calcularIdadeEmIdadeDeCachorro()
             + "\nLatido: " + emitirLatido();
    }
}
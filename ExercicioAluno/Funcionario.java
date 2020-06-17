public class Funcionario extends Pessoa {

    private int numeroDeRegistro;
    private double salarioFixo;
    
    public Funcionario() {
        super();
    }
    
    public Funcionario(String nome, String sobrenome, String email, String dataDeNascimento, int numeroDeRegistro, 
                       double salarioFixo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeRegistro = numeroDeRegistro;
        this.salarioFixo = salarioFixo;                     
    }
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    @Override
    public String toString() {
        return "toString Funcionario"
             + "\nNome: " + this.nome
             + "\nSobrenome: " + this.sobrenome
             + "\nEmail: " + this.email
             + "\nData de nascimento: " + this.dataDeNascimento
             + "\nNúmero de registro: " + this.numeroDeRegistro
             + "\nSalario fixo: " + this.salarioFixo;
    }
}
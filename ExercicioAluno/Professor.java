public class Professor extends Pessoa {
    
    private int numeroDeRegistro;
    private double numeroDeHorasTrabalhadas;
    private double valorHora;
   
    public Professor() {
        super();
    } 
    
    public Professor(String nome, String sobrenome, String email, String dataDeNascimento, int numeroDeRegistro, 
                     double numeroDeHorasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeRegistro = numeroDeRegistro;
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getNumeroDeHorasTrabalhadas() {
        return this.numeroDeHorasTrabalhadas;
    }
    
    public void setNumeroDeHorasTrabalhadas(double numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    } 
    
    public double calcularSalarioBruto() {
        return this.numeroDeHorasTrabalhadas * this.valorHora;
    }
    
    @Override
    public String toString() {
        return "toString Professor"
             + "\nNome: " + this.nome
             + "\nSobrenome: " + this.sobrenome
             + "\nEmail: " + this.email
             + "\nData de nascimento: " + this.dataDeNascimento
             + "\nNúmero de registro: " + this.numeroDeRegistro
             + "\nNúmero de horas trabalhadas: " + this.numeroDeHorasTrabalhadas
             + "\nValor hora: " + this.valorHora
             + "\nSalario bruto: " + this.calcularSalarioBruto();
    }
}
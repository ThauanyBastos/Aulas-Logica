public class PessoaFisica extends Cliente {
    
    private String estadoCivil;
    private String cpf;
    private String dataDeNascimento;
    
    public PessoaFisica() {
        super();
    }
    
    public PessoaFisica(int codigoDoCliente, String nome, String profissao, String estadoCivil, String cpf, String dataDeNascimento) {
        this.codigoDoCliente = codigoDoCliente;
        this.nome = nome;
        this.profissao = profissao;
        this.estadoCivil = estadoCivil;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    
    public void setDataDeNascimentoCpf(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    @Override
    public String toString() {
        return "toString Pessoa Fisica"
             + "\nCódigo do cliente: " + this.codigoDoCliente
             + "\nNome: " + this.nome
             + "\nProfissão: " + this.profissao
             + "\nEstado civil: " + this.estadoCivil
             + "\nCPF: " + this.cpf
             + "\nData de nascimento: " + this.dataDeNascimento;
    }
}
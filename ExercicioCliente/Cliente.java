public class Cliente {
    
    protected int codigoDoCliente;
    protected String nome;
    protected String profissao;
    
    public Cliente() {   
    }
    
    public Cliente(int codigoDoCliente, String nome, String profissao) {
        this.codigoDoCliente = codigoDoCliente;
        this.nome = nome;
        this.profissao = profissao;
    }
    
    public int getCodigoDoCliente() {
        return this.codigoDoCliente;
    }
    
    public void setCodigoDoCliente(int codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString() {
        return "toString cliente"
             + "\nCódigo do cliente: " + this.codigoDoCliente
             + "\nNome: " + this.nome
             + "\nProfissão: " + this.profissao;
    }
}
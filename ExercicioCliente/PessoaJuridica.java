public class PessoaJuridica extends Cliente {
    
    private String razaoSocial;
    private String cnpj;
    private int inscricaoEstadual;
    private double capitalInicial;
    
    public PessoaJuridica() {
        super();
    }
    
    public PessoaJuridica(int codigoDoCliente, String nome, String profissao, String razaoSocial, 
                          String cnpj, int inscricaoEstadual, double capitalInicial) {
        this.codigoDoCliente = codigoDoCliente;
        this.nome = nome;
        this.profissao = profissao;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.capitalInicial = capitalInicial;
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public int getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public double getCapitalInicial() {
        return this.capitalInicial;
    }
    
    public void setcapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    
    @Override
    public String toString() {
        return "toString Pessoa Juridica"
             + "\nCódigo do cliente: " + this.codigoDoCliente
             + "\nNome: " + this.nome
             + "\nProfissão: " + this.profissao
             + "\nRazão social: " + this.razaoSocial
             + "\nCNPJ: " + this.cnpj
             + "\nInscrição estadual: " + this.inscricaoEstadual
             + "\nCapital inicial: " + capitalInicial;
    }
}

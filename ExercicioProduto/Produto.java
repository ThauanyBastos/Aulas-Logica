public class Produto {

    String descricao;
    String fornecedor;
    double valorCusto;
    int quantidade;
    
    public double calcularValorEmEstoque() {
        return this.quantidade * this.valorCusto;
    }
    
    public double adicinar65PorcentoNoValorCusto() {
        return this.valorCusto * 1.65;
    }
    
    public double adicinarPorcentagemNoValorCusto(double porcentagem) {
        //return this.valorCusto * porcentagem; assim o usuario precisa digitar 1.65 na classe primcipal
        return this.valorCusto + this.valorCusto * porcentagem/100; //só precisa digitar 65 na classe principal
    }
}
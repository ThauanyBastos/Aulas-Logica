public class Principal {
   
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Produto produto = new Produto();
        
        produto.descricao = "Arroz";
        produto.fornecedor = "Zé";
        produto.valorCusto = 100;
        produto.quantidade = 5;
        
        System.out.println("Descrição do produto: " + produto.descricao
                         + "\nFornecedor do produto: " + produto.fornecedor
                         + "\nValor de custo: " + produto.valorCusto
                         + "\nQuantidade: " + produto.quantidade
                         + "\nValor em estoque: " + produto.calcularValorEmEstoque()
                         + "\nValor de custo com 65% de acréssimo: " + produto.adicinar65PorcentoNoValorCusto()
                         + "\nValor de custo com acréssimo: " + produto.adicinarPorcentagemNoValorCusto(65));
    }
}
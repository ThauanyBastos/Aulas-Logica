/**
 * Escreva a descrição da classe Nadador aqui.
 * 
 * @author Thauany Azevedo Bastos 
 * @version 1.0
 * @since 01/06/2020 - 09:23
 * @category Model
 */

public class Nadador {
    
    private String nome;
    private int idade;
    
    public Nadador() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * @param Recebe a idade do nadador 
     * @return Retorna a categoria de nadador conforme a idade
     */
    public String verificarNadador() {
        if(idade >= 18) {
            return "Adulto";
        } else if(idade >= 11 && idade <= 17) {
            return "Juvenil";
        } else if(idade >= 8 && idade <= 10) {
            return "Infantil";
        }
        return "Não pode ser nadador! Idade mínima é 8 anos.";
    } 
    
    @Override
    public String toString() {
        return "Nome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nVerificar categoria de nadador: " + this.verificarNadador();
    }
}

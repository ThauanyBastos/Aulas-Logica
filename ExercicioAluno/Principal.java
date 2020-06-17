public class Principal {
    
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa("Daniel", "Santos", "Daniel@gmail.com", "30/03/2000");
        System.out.println(pessoa);
        
        Aluno aluno = new Aluno("Samanta", "Santos", "Sam@gmail.com", "12/03/2000", 4, 2);
        aluno.calcularMediaAritmetica();
        System.out.println(aluno);
        
        Funcionario funcionario = new Funcionario("Roberto", "Brum", "Robertoprof@gmail.com",
        "12/07/1980", 117045624, 1200);
        System.out.println(funcionario);
        
        Professor professor = new Professor("Daniel", "Santos", "Daniel@gmail.com",
        "30/03/2000", 117045624, 30, 6);
        professor.calcularSalarioBruto();
        System.out.println(professor);
    }
}
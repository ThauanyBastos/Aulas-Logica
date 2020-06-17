public class Principal {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Cliente cliente = new Cliente(851574, "rafael", "enfermeiro");
        System.out.println(cliente);
        
        PessoaFisica pessoaFisica = new PessoaFisica(52225, "gabriela", "medica", "solteira", "9110276593", "16/05/1980");
        System.out.println(pessoaFisica);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica(254123, "cleber", "professor", "coca cola", "422024504", 123456789, 30000);
        System.out.println(pessoaJuridica);
        
        
    } 
}
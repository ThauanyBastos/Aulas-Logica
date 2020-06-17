public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Animal animal = new Animal("Sky", 5);
        System.out.println(animal);
        
        Cachorro cachorro = new Cachorro("Toby", 3, "Médio", "Pastor Alemão", "Preto");
        cachorro.calcularIdadeEmIdadeDeCachorro();
        cachorro.emitirLatido();
        System.out.println(cachorro);
        
        Gato gato = new Gato("Mimi", 1, "Baixo", "Rato", "Grandes");
        gato.emitirMiado();
        gato.calcularIdadeEmDias();
        System.out.println(gato);
    }
}
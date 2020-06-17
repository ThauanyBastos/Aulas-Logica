public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Quadrado quadrado = new Quadrado();
        quadrado.setNomeFigura("Quadrado");
        quadrado.setArea(5);
        quadrado.setPerimetro(5);
        quadrado.setLado(5);
        System.out.println(quadrado);
    }
}
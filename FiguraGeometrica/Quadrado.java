public class Quadrado implements FiguraGeometrica {
    
    public String nomeFigura; 
    public double area;
    public double perimetro;
    public double lado;
    
    public Quadrado() {
    }
    
    @Override
    public String getNomeFigura() {
        return this.nomeFigura;
    }
    
    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    @Override
    public double getArea() {
        return this.area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public double getPerimetro() {
        return this.perimetro;
    }
    
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public String toString() {
        return "Nome da figura: " + this.nomeFigura
             + "\nÁrea: " + this.area
             + "\nPerímetro: " + this.perimetro
             + "\nLado: " + this.lado;
    }
}
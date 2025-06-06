public class Quadrado {
    
    private double lado;

    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    
    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }

    
    public double getLado() {
        return this.lado;
    }

    
    public double calcularArea() {
        return this.lado * this.lado;
    }
}

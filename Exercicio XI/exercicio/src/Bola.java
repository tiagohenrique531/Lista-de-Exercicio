public class Bola {
    // Atributos
    private String cor;
    private double circunferencia;
    private String material;

    // Construtor
    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    // Método para trocar a cor da bola
    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    // Método para mostrar a cor atual da bola
    public String mostraCor() {
        return this.cor;
    }

    // Métodos adicionais opcionais (getters)
    public double getCircunferencia() {
        return circunferencia;
    }

    public String getMaterial() {
        return material;
    }
}

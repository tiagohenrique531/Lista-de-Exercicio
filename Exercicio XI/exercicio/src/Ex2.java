public class Ex2 {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5.0);

        System.out.println("Lado atual: " + q.getLado());
        System.out.println("Área: " + q.calcularArea());

        q.mudarLado(10.0);
        System.out.println("Novo lado: " + q.getLado());
        System.out.println("Nova área: " + q.calcularArea());
    }
}

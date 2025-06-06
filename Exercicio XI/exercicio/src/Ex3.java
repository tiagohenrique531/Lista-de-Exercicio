import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as medidas do local:");
        System.out.print("Base (em metros): ");
        double base = scanner.nextDouble();

        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();

        // Criando objeto do tipo Retangulo
        Retangulo local = new Retangulo(base, altura);

        // Exibindo resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Base: " + local.getBase() + " m");
        System.out.println("Altura: " + local.getAltura() + " m");
        System.out.println("Área: " + local.calcularArea() + " m²");
        System.out.println("Perímetro: " + local.calcularPerimetro() + " m");

        scanner.close();
    }
}

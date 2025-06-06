public class Ex4 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana", 18, 55.0, 1.60);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Peso: " + p.getPeso() + " kg");
        System.out.println("Altura: " + p.getAltura() + " m");

        // Simular 5 anos de envelhecimento
        for (int i = 0; i < 5; i++) {
            p.envelhecer();
        }

        // Alterar peso
        p.engordar(2);
        p.emagrecer(1);

        System.out.println("\n--- Após 5 anos ---");
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Peso: " + p.getPeso() + " kg");
        System.out.println("Altura: " + p.getAltura() + " m");
    }
}

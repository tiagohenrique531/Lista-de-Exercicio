public class Ex1 {
    public static void main(String[] args) {
        Bola minhaBola = new Bola("Azul", 68.5, "Couro");

        System.out.println("Cor atual: " + minhaBola.mostraCor());
        
        minhaBola.trocaCor("Vermelha");
        System.out.println("Nova cor: " + minhaBola.mostraCor());
    }
}


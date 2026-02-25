public class Main {

    public static void main(String[] args) {

        Veiculo bike = new Bicicleta("Dropp", 2025);
        Veiculo carro = new Carro("Civic", 2026);

        bike.mover();
        carro.mover();

    }
}

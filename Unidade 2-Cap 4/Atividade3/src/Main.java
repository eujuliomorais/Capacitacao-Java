public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa("Casa1");
        Casa casa2 = new Casa("Casa2");

        casa.addComodo("Sala", 12);
        casa.addComodo("Quarto1", 8);
        casa.addComodo("Quarto2", 8);
        casa.addComodo("Cozinha", 10);
        casa.addComodo("Banheiro", 4);

        casa2.addComodo("Sala", 15);

        casa.listarComodos();
        casa2.listarComodos();

    }
}
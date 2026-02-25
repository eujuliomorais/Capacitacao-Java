public class Carro extends Veiculo{

    Carro(String modelo, int ano){
        super(modelo, ano);
    }

    @Override
    public void mover(){
        System.out.println("O carro " + getModelo() + " de " + getAno() + " está se movendo");

    }
}

public class Bicicleta extends Veiculo{

    Bicicleta(String modelo, int ano){
        super(modelo, ano);
    }

    @Override
    public void mover(){
        System.out.println("A bike " + getModelo() + " de " + getAno() + " está se movendo");
    }
}

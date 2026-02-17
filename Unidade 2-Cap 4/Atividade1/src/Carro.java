public class Carro {
    private Motor motor;

    public Carro(int potencia){
        this.motor = new Motor(potencia);
    }

    public void ligar(){
        if(this.motor != null){
            System.out.println("Carro ligado com motor de " + this.motor.potencia + "cv funcionando");
        }else{
            System.out.println("Não foi possível ligar, o carro não tem motor");
        }
    }
}

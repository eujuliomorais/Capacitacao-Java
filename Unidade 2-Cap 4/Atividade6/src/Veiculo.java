public abstract class Veiculo {
    private String modelo;
    private int ano;

    Veiculo( String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public abstract void mover();
}

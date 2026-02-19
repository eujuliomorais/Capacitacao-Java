import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String nomeCasa;
    private List<Comodo> comodos;

    public Casa(String nomeCasa){
        this.nomeCasa = nomeCasa;
        this.comodos = new ArrayList<>();
    }

    public void addComodo(String nome, double tamanhoM2){
        Comodo comodo = new Comodo(nome, tamanhoM2);
        this.comodos.add(comodo);
    }

    public void listarComodos(){
        System.out.println(this.nomeCasa);
        for(Comodo a : this.comodos){
            System.out.println(a.getNome() + " | " + "Tamanho: " + a.getTamanhoM2());
        }
    }

}

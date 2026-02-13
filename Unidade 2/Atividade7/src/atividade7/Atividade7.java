package atividade7;

/**
 *
 * @author julio mateus morais
 */
public class Atividade7 {

    public static void main(String[] args) {
        
        Animal[] animal = new Animal[10];
        
        animal[0] = new Gato();
        animal[1] = new Gato();
        animal[2] = new Cachorro();
        animal[3] = new Gato();
        animal[4] = new Cachorro();
        animal[5] = new Gato();
        animal[6] = new Cachorro();
        animal[7] = new Gato();
        animal[8] = new Cachorro();
        animal[9] = new Gato();
        
        for(Animal x : animal){
            x.fazerSom();
        }
    }
    
}

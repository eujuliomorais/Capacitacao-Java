public class Main {
    public static void main(String[] args) {

        Autenticavel usuario = new Usuario();
        Autenticavel adm = new Administrador();


        System.out.println(usuario.autenticar("123456"));
        System.out.println(adm.autenticar("654321"));

    }
}
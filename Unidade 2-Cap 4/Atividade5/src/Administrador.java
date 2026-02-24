public class Administrador implements Autenticavel {
    private String senha = "654321";

    @Override
    public boolean autenticar(String senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}

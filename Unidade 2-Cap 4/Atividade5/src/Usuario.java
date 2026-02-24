public class Usuario implements Autenticavel{
    private String senha = "123456";

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }
}

public class Sistema{

    private Usuario usuario;

    public void inicializaUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void criarUsuario(String cpf, String nome, String email, String senha){
        Usuario usuario = new Usuario(cpf, nome, email, senha);
        this.usuario = usuario;
        thisusuario.setCpf(cpf);
        thisusuario.setCpf(nome);
        thisusuario.setCpf(email);
        thisusuario.setCpf(senha);
    }

    public void boaNoitePersolizada(){
        System.out.println("Boa noite, " + usuario.getNome() + "!");
    }
}

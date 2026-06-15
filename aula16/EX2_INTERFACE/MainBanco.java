public class MainBanco {

    public static void main(String[] args) {

        BancoDeDados bd = new BancoDeDados();

        bd.conectar();
        bd.inserir();
        bd.atualizar();
        bd.excluir();
        bd.desconectar();
    }
}

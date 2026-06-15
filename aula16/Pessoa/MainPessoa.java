public class MainPessoa {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica(
                "João",
                "Santa Maria",
                "123.456.789-00"
        );

        PessoaJuridica pj = new PessoaJuridica(
                "Empresa ABC",
                "Porto Alegre",
                "12.345.678/0001-99"
        );

        pf.efetuarCompra(500);
        pj.efetuarCompra(2000);
    }
}

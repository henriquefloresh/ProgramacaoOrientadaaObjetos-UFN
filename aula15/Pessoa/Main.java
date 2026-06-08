public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Henrique Hiemer", "Santa Maria", "037.326.450-02");

        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ Ltda", "Rio de Janeiro", "12.345.678/0001-99");

        System.out.println("=== COMPRA PESSOA FÍSICA ===");
        pf.efetuarCompra(250.00);

        System.out.println();

        System.out.println("=== COMPRA PESSOA JURÍDICA ===");
        pj.efetuarCompra(1500.00);
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("Pessoa Jurídica: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Compra realizada no valor de R$ " + valor);
    }
}

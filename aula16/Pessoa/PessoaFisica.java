public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    @Override
    public void efetuarCompra(double valor) {
        System.out.println("Pessoa Física " + nome +
                " realizou uma compra de R$ " + valor);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

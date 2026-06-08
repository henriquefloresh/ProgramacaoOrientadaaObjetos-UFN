
abstract class Pessoa {
    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
 
    public abstract void efetuarCompra(double valor);
}

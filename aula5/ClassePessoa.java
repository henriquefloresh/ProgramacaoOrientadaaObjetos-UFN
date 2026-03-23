package pkg;
//ex3
public class ClassePessoa {
	public String nome;
	public String email;
	public String dataNascimento;
	public String endereco;
	public boolean admin;
	
	 // Método que retorna o email
    public String Email() {
        return email;
    }

    // Método para promover a admin
    public void promoverAdmin() {
        admin = true;
    }
}

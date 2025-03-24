package Atividade;


public class Pessoa {
    private String nome;
    private String email;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setIdade(int Idade) {
        this.idade = Idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + "Idade: " + idade + "Email: " + email);
    }
}
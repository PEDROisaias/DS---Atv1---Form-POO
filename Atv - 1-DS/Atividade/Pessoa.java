package Atividade;

public class Pessoa {
    private String nome;
    private String email;
    private int idade;
        
        public void setNome(String nome) {
            this.nome = nome.toUpperCase();
        }

        public void setEmail(String email) {
            this.email = email.toLowerCase();
        }

        public void setIdade(int idade) {
            this.idade = idade;
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
    }



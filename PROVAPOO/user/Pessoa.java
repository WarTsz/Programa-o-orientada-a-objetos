package user;
public abstract class Pessoa {
    private String nome;
    public Pessoa(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
}
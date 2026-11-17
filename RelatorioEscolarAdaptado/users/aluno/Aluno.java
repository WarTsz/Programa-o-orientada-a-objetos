package users.aluno;

import java.util.HashMap;

import users.Pessoa;

//Pilar L: Substituição de liskov, uma classe filha herda todas as capacidades da mãe + capacidades extras

public class Aluno extends Pessoa{
    private HashMap notas = new HashMap<>();
    private boolean aprovado = false;
    public Aluno(String nome,int idade,String cpf) {
        super(nome, idade, cpf);
    }
    public HashMap getNotas() {
        return notas;
    }
}
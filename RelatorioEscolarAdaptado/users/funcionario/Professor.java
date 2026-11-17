package users.funcionario;

import java.util.ArrayList;

import app.Colors;
import erros.AlunoNaoExistenteException;
import erros.BimestreInvalidoException;
import erros.NotaInvalidaException;
import users.Pessoa;
import users.aluno.Aluno;

public class Professor extends Pessoa{
    private ArrayList notificacoes = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    public Professor(String nome,int idade,String cpf) {
        super(nome, idade, cpf);
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public ArrayList getNotificacoes() {
        return notificacoes;
    }
    public void AdicionarNota(Aluno aluno,int bimestre,double nota) throws NotaInvalidaException,AlunoNaoExistenteException,BimestreInvalidoException{
        if (aluno == null) {
            throw new AlunoNaoExistenteException();
        }
        else if (nota<0 || nota>10) {
            throw new NotaInvalidaException();
        }
        else if (aluno.getNotas().size()+1<bimestre || bimestre<1) {
            throw new BimestreInvalidoException();
        }
        else {
            String codigo = "Bimestre "+String.format("%d",bimestre);
            aluno.getNotas().put(codigo,nota);
            Colors.print("\nVocê atribuiu a nota "+aluno.getNotas().get(codigo)+"\nAo aluno:"+aluno.getNome()+"\nNo Bimestre: "+String.format("%d",bimestre)+"\n","RED");
        }
    }
    public void exibirNotificacoes() {
        Colors.print("\nProfessor:"+this.nome+"\nNotificações:\n","RED");
        for (int i=0;i<notificacoes.size();i++) {
            Colors.print(notificacoes.get(i), "CYAN");
        }
    }
}

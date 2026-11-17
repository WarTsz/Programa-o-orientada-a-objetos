package secretaria.boletim;

import java.util.HashMap;

import app.Colors;
import users.aluno.Aluno;

public class SaidaConsole implements GeradorBoletim{
    @Override
    public void enviar(Aluno aluno) {
        String dados = "Nome: "+aluno.getNome()+"Idade: "+String.format("%d",aluno.getIdade())+"CPF: "+aluno.getCpf()+"\n";
        Object notas = aluno.getNotas().entrySet();
        Colors.print(dados, null);
        Colors.print(notas, "GREEN");
        
    }

}
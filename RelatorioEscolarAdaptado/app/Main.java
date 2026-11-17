package app;
import app.Colors;
import secretaria.Central;
import secretaria.boletim.GeradorBoletim;
import secretaria.boletim.SaidaConsole;
import secretaria.notificador.Notificador;
import secretaria.notificador.NotificadorArquivo;
import users.aluno.Aluno;
import users.funcionario.Professor;

public class Main {

    public static void main(String[] args) {
        GeradorBoletim formato = new SaidaConsole();
        Notificador notificadorFormato = new NotificadorArquivo();
        Central secretariCentral = new Central(formato,notificadorFormato);
        Professor professor01 = new Professor("Jubileu", 30, "006");
        Aluno aluno01 = new Aluno("Joao", 12, "001");
        Aluno aluno02 = new Aluno("Pedro", 11, "002");
        Aluno aluno03 = new Aluno("Maria", 13, "003");
        Aluno aluno04 = new Aluno("Jose", 10, "004");
        Aluno aluno05 = new Aluno("Roberto", 13, "005");
        professor01.getAlunos().add(aluno01);
        professor01.getAlunos().add(aluno02);
        professor01.getAlunos().add(aluno03);
        professor01.getAlunos().add(aluno04);
        professor01.getAlunos().add(aluno05);
        professor01.AdicionarNota(aluno01, 1, 10);
        professor01.AdicionarNota(aluno01, 2, 9);
        professor01.AdicionarNota(aluno01, 3, 8);
        professor01.AdicionarNota(aluno01, 4, 8);
        secretariCentral.addProfessor(professor01);
        secretariCentral.gerarBoletins(); 
        professor01.exibirNotificacoes();
        secretariCentral.notificarProfessores();
    }
}
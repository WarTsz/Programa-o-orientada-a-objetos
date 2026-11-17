package secretaria.notificador;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import users.funcionario.Professor;

public class NotificadorArquivo implements Notificador {
    @Override
    public void enviar(Professor professor) {
        String AC_DIR = System.getProperty("user.dir");
        Path absoluto = Path.of(AC_DIR+"/users/funcionario/dados/professor");toString();
        Path notificacoes = Path.of(absoluto+"/notificacoes.txt");
        try {
            Files.createDirectories(absoluto);
        } catch (Exception e) {System.out.println(e.getMessage());}
        try {
            Files.createFile(notificacoes);}
        catch (Exception e) {System.out.println(e.getMessage());}
        String pureString = "";
        for (int i=0;i<professor.getNotificacoes().size();i++) {
            pureString+=professor.getNotificacoes().get(i);
        }
        try {
            Files.writeString(notificacoes, pureString,StandardOpenOption.CREATE,StandardOpenOption.APPEND);}
        catch (Exception e) {
            System.out.println(e.getMessage());}
        }
}
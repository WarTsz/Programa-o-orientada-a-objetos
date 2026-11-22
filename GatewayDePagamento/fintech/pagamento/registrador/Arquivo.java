package fintech.pagamento.registrador;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import fintech.pagamento.Pagamento;

public class Arquivo implements GeradorLog{
    @Override
    public void gerarLog(Pagamento pagamento) {
        String AC_DIR = System.getProperty("user.dir");
        Path dataPath = Path.of(AC_DIR+"/fintech/pagamento/dados");
        try {
            Files.createDirectories(dataPath);
        } catch (Exception e) {
        }
        Path logs = Path.of(dataPath+"/logs.txt");
        try {
            Files.createFile(dataPath);
        } catch (Exception e) {
        }
        String pureString = ("Pagamento concluído:"+
                    "\nValor: "+pagamento.getValor()+
                    "\nDescrição: "+pagamento.getDescricao()+
                    "\nData do pagamento: "+pagamento.getData()+
                    "\nValor da taxa: "+pagamento.getTaxa()+"\n");
        try {
            Files.writeString(logs, pureString,StandardOpenOption.CREATE,StandardOpenOption.APPEND);}
        catch (Exception e) {
            System.out.println(e.getMessage());}
        }

        
}

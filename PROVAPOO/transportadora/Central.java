package transportadora;
import java.util.ArrayList;

import erros.*;
import user.*;
import transportadora.exibicao.*;
public class Central {
    private ArrayList<Envio> envios = new ArrayList<>();
    private Exibivel registrador;
    final static String nome = "SpeedBoxCentral";
    public Central(Exibivel registrador) throws IllegalArgumentException {
        if (registrador == null) {
            throw new IllegalArgumentException();
        }
        this.registrador = registrador;
        
        // Principio (D) inversão de dependência: Os modulos de alto-nível não conversam com os de baixo nível, e sim com abstrações
        //Central só conhece a interface Exibivel, e não como ela implementa aqueles métodos (se salva em arquivo, se exibe em console...)
    }
    public void adicionarEnvio(Atendente atendente,Envio envio) {
        if (atendente instanceof Gerente == false) {
            throw new IllegalArgumentException("ERRO!!!!");
        }
        else {
        this.envios.add(envio);}
    }
    public ArrayList<Envio> getEnvios(Atendente atendente) {
        if (atendente == null) {
            throw new IllegalArgumentException("L");
        }
        return this.envios;
    }
    public void faturamentoTotal(Atendente atendente) {
        if (atendente == null) {
            throw new IllegalArgumentException();
        }
        double valor = 0;
        for (int i=0;i<envios.size();i++) {
            valor+=envios.get(i).calcularTotal();
        }
        registrador.enviar("TOTAL FATURADO: "+String.format("%f",valor));
    }
    public void maisCaro(Atendente atendente) {
        if (atendente == null) {
            throw new IllegalArgumentException();
        }
        if (envios.size() == 0) {
            System.out.println("Não há envios");
            return;
        }
        else {
            double maior = envios.get(0).calcularTotal();
            for (int i=1;i<envios.size();i++) {
                if (maior<envios.get(i).calcularTotal()) {
                    maior = envios.get(i).calcularTotal();
                }
            }
            registrador.enviar("VALOR MAIS CARO: "+String.format("%f",maior));
        }
    }

}
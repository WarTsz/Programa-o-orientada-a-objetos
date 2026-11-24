package transportadora.exibicao;
public interface Exibivel {
    public void enviar(String relatorio);
}

//Principio (I) Segregação de interfaces: As classes que implementam exibir honram o contrato de Exibivel, não fingem.
//Nenhuma classe implementa uma interface cujo contrato não seja inteiramente cumprido. (resumidamente)
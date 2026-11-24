package app;
import transportadora.*;
import transportadora.exibicao.*;
import produto.*;
import user.*;

//Primeiro principio S: responsabilidade única. 
//Cada arquivo do projeto contém classes relacionadas e que desempenham funções específicas.

public class Principal {
    public static void main(String[] args) {
        Atendente gerente01 = new Gerente("BolsoLula");
        Atendente atendente01 = new Atendente("Nordestina");
        Remetente pessoa01 = new Remetente("ManuelGomi","6767676767");
        Remetente pessoa02 = new Remetente("LuizaMel","717117171");
        Encomenda encomenda01 = new Encomenda("Geladeira EletroLux",30,pessoa01);

        try {
            Encomenda encomenda02 = new Encomenda("GTA6",-11,pessoa01);
        }
        catch Exception e {}
        Encomenda encomenda03 = new Encomenda("PC GAMER REALOFICIAL",7,pessoa02);
        Envio envio01 = new EnvioExpresso(encomenda01,LocalDate.now(),1250);
        Envio envio02 = new EnvioInternacional(encomenda03,LocalDate.now(),10000);
        Exibivel console01 = new ExibirConsole();
        Central CentralRealOficial = new Central(console01);
        Central.adicionarEnvio(gerente01,envio01);
        Central.adicionarEnvio(gerente01,envio02);
        Central.faturamentoTotal(atendente01);
        Central.maisCaro(atendente01);


    }
}
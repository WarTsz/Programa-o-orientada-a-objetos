package Impressoras;
import Impressoras.Interfaces.Escaneia;
import Impressoras.Interfaces.Fax;
public class Multifuncional extends Basica implements Escaneia,Fax{
    @Override
    public void Escanear() {
    }
    @Override
    public void EnviarFax() {
    }
}
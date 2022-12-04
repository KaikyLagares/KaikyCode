package estudo1;

/**
 *
 * @author Kaiky
 */
public class Estudo1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";

        c1.modelo = " fina";

        c1.ponta = (float) 0.5;

        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.carga = 10;
        c2.cor = " Vermelha ";
        c2.modelo = " nanquim";
        c2.ponta = 0.7f;
        c2.status();c2.destampar();
        c2.rabiscar();
        
    }

}

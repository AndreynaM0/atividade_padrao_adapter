//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TecladoC teclado = new TecladoC();

        AdaptadorC_Usb adaptador = new AdaptadorC_Usb(teclado);

        Gabinete gabinete = new Gabinete();

        gabinete.conectarComDispositivo(adaptador);

    }
}
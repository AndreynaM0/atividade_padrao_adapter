public class AdaptadorC_Usb implements USB{

    private TecladoC tecladoSaidaC;

    public AdaptadorC_Usb( TecladoC tecladoSaidaC){
        this.tecladoSaidaC= tecladoSaidaC;
    }

    @Override
    public void conectorUSB() {
        System.out.println("Adptador da conexão tip C para USB");
        tecladoSaidaC.envioDeDadosC();
    }
}

package DispositivosEletronicos.Main.Entidades;


public class Smartphone extends DispositivoEletronico {

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
}

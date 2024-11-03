//Subscriber Concreto
public class CarroListener implements EventListener{
    private int quantidade;
    
    CarroListener() {
        this.quantidade = 0;
    }

    CarroListener(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void update() {
        System.out.println("\tExistem " + quantidade + " carros disponíveis!");
    }

    public void addCarro(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeCarro(int quantidade) {
        this.quantidade -= quantidade;
    }


}

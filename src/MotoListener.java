//Subscriber Concreto
public class MotoListener implements EventListener{
    private int quantidade;

    MotoListener() {
        this.quantidade = 0;
    }

    MotoListener(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void update() {
        System.out.println("\tExistem " + quantidade + " motos disponíveis!");
    }

    public void addMoto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeMoto(int quantidade) {
        this.quantidade -= quantidade;
    }
}

public class Concessionaria {
    EventManager events;

    Concessionaria() {
        events = new EventManager();
    }

    public void addCarro(int quantidade, CarroListener carro) {
        carro.addCarro(quantidade);
        events.notifier("addCarro");
    }

    public void removeCarro(int quantidade, CarroListener carro) {
        carro.removeCarro(quantidade);
        events.notifier("removeCarro");
    }

    public void addMoto(int quantidade, MotoListener moto) {
        moto.addMoto(quantidade);
        events.notifier("addMoto");
    }

    public void removeMoto(int quantidade, MotoListener moto) {
        moto.removeMoto(quantidade);
        events.notifier("removeMoto");
    }
}

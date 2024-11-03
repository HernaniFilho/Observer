import java.util.Scanner;

public class Cliente {
    
    public static void main(String[] args) throws Exception {
        Concessionaria con = new Concessionaria();

        CarroListener carro = new CarroListener();
        con.events.subscribe("addCarro", carro);
        con.events.subscribe("removeCarro", carro);

        MotoListener moto  = new MotoListener(2);
        con.events.subscribe("addMoto", moto);
        con.events.subscribe("removeMoto", moto);

        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 5) {
            System.out.println("\t\tMenu");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Adicionar Moto");
            System.out.println("3. Remover Carro");
            System.out.println("4. Remover Moto");
            System.out.println("5. Sair");
            System.out.println("Escolha: ");
            op = sc.nextInt();

            //Aqui é alterado a quantidade dos produtos, os métodos add e remove de Carro e Moto
            //vão adicionar uma quantidade inteira a uma variavel das classes concretas CarroListener e MotoListener
            //e por fim vai notificar (update()) quando há uma mudança
            int quantidade = 0;
            switch (op) {
                case 1:
                    System.out.println("\nInforme a quantidade: ");
                    quantidade = sc.nextInt();
                    con.addCarro(quantidade, carro);
                    break;
                case 2:
                    System.out.println("\nInforme a quantidade: ");
                    quantidade = sc.nextInt();
                    con.addMoto(quantidade, moto);
                    break;
                case 3:
                    System.out.println("\nInforme a quantidade: ");
                    quantidade = sc.nextInt();
                    con.removeCarro(quantidade, carro);
                    break;
                case 4:
                    System.out.println("\nInforme a quantidade: ");
                    quantidade = sc.nextInt();
                    con.removeMoto(quantidade, moto);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("\nValor inválido");
                    break;
            }
        }
    }
}

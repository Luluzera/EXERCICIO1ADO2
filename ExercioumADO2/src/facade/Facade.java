package facade;

import model.Cliente;

public class Facade {
    private static Facade instance;

    private Facade() {}

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void exibirInformacoesCliente(Cliente cliente) {
        System.out.println(cliente);
    }
}

package entities;

public class Cliente {

    private String nomeCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {

        return nomeCliente;
    }
}

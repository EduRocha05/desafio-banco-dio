package entities;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("*=====* Extrato Conta Corrente *=====*");
        super.imprimirInfoComuns();


    }

    @Override
    public String toString() {
        return "\nConta Corrente {" +
                "Agencia = " + agencia +
                ", Numero = " + numero +
                ", Cliente = " + nomeCliente +
                '}';
    }
}

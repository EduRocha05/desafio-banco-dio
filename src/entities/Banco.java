package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeBanco;
    protected Conta conta;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarContas(Conta conta){
        contas.add(conta);
    }

    @Override
    public String toString() {
        return "\nBanco = " + nomeBanco +
                ", Contas Cadastradas = " + contas;
    }
}

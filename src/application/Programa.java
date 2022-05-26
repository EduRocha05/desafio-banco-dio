package application;
/*Um Banco oferece aos seus clientes dois tipos de conta(corrente e poupança),
as quais possuem as funcionalidades de depósito, saque e transferencia(entre contas da propia isntituição)
 */

import entities.*;

public class Programa {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Banco DIO");

        Cliente cliente1 = new Cliente("Eduardo");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("João");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(100);

        Conta cc2 = new ContaCorrente(cliente2);
        cc2.depositar(500);

        Conta poupanca = new ContaPoupança(cliente1);
        Conta poupanca2 = new ContaPoupança(cliente3);

        cc.transferir(100, poupanca);
        cc2.transferir(250, poupanca2);

        cc.imprimirExtrato();
        cc2.imprimirExtrato();

        poupanca.imprimirExtrato();
        poupanca2.imprimirExtrato();

        banco1.adicionarContas(cc);
        banco1.adicionarContas(cc2);
        banco1.adicionarContas(poupanca);
        banco1.adicionarContas(poupanca2);

        System.out.println(banco1);



    }
}

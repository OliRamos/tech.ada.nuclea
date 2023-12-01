package tech.ada.nuclea;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.nomeDoTitular = "Oliver Ramos";
        conta.saldo = 0.0;
        conta.taxaRendimento = 0.1;

        System.out.println(conta.nomeDoTitular);
        System.out.println(conta.saldo);
        System.out.println(conta.taxaRendimento);

        Double valorRendimento = conta.rende();

        System.out.println(valorRendimento);
    }
}

package tech.ada.nuclea.aula3;

public class TesteAula03 {

    public static void main(String[] args){

        ContaBancaria conta = new ContaBancaria("Oliver Ramos", 10000);

        conta.deposito(1000);
        conta.saque(11000);

        //conta.saldo = 5000.00;

        //System.out.println("Meu saldo é " + conta.saldo);
    }
}

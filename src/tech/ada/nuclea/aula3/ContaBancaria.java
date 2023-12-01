package tech.ada.nuclea.aula3;

public class ContaBancaria {

    private String nomeTitular;
    private double saldo;

    ContaBancaria(){}

    ContaBancaria(String nome, double novoSaldo){
        nomeTitular = nome;
        saldo = novoSaldo;
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("O saldo atual é: " + saldo);
    }

    public void saque(double valorSaque){
        if(this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            System.out.println("O saldo agora é: " + this.saldo);
        }
    }

}

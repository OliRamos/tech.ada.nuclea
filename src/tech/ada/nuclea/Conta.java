package tech.ada.nuclea;

import java.time.LocalDateTime;

public class Conta {
    String nomeDoTitular;
    Double saldo;
    Double taxaRendimento;
    LocalDateTime dataCriacao;

    public Conta() {
       dataCriacao = LocalDateTime.now();
    }

    public Conta(String nomeDoTitular, Double saldo, Double taxaRendimento, LocalDateTime dataCriacao) {
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
        this.dataCriacao = dataCriacao;
    }

    Double rende(){
        return saldo * taxaRendimento;
    }
}

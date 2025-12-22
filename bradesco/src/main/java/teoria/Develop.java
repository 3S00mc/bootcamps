package br.com.bradesco.teoria;

public record Develop (double extra) {

    //nao e possivel extender de classes. Records nao podem ter propriedades internas, apenas no construtor
    // O que e estatico nao pode ser passado por heranca
}

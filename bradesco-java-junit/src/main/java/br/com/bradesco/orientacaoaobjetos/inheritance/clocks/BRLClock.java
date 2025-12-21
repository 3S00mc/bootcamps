package br.com.bradesco.orientacaoaobjetos.inheritance.clocks;

public class BRLClock extends Clock{

    public BRLClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    Clock convert(Clock clock) {
        return null;
    }
}

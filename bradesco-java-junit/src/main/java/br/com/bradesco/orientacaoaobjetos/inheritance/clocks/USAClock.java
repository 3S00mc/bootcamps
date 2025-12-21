package br.com.bradesco.orientacaoaobjetos.inheritance.clocks;

public class USAClock extends Clock{
    public USAClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    private String periodIndicator;

    public void setHour(int hour){
        if (hour >= 12) {
            this.hour = 12;
            this.periodIndicator = "PM";
            return;
        }
        this.hour = hour;
    }

    @Override
    Clock convert(Clock clock) {
        return null;
    }

}

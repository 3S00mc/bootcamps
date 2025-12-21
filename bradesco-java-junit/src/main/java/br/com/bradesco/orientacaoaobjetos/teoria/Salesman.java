package br.com.bradesco.orientacaoaobjetos.teoria;

public non-sealed class Salesman extends Employee{

    // Attributes
    private double percentPerSold;

    //Constructors
    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    public Salesman() {
    }

    //Methods
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(final double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}

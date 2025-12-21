package br.com.bradesco.teoria;

public non-sealed class Manager extends Employee{

    // Attributes
    private String login;
    private String password;
    private double comission;

    //Constructors
    public Manager(String code, String name, String address, int age, double salary, String login, String password, double comission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    public Manager() {
    }

    //Methods
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}

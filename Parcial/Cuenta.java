//PRUEBAS
public class Cuenta {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String titular, String numeroCuenta, double Saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.Saldo = saldo;

    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;

    }
}
 
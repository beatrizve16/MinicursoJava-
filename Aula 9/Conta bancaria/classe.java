package ContaBancaria.Entidades;
public class ContaBancaria {
    public double numero;
    public double saldo;
    public double sacar;
    public double depositar;
    public double funcDepositar(double saldo, double depositar){
         saldo += depositar;
         return saldo;
    }
    public double funcSacar(double saldo, double sacar){
        saldo -= sacar;
        return saldo; 
    }
    public double funcVerificar(double saldo){
        return (saldo);
    }
}



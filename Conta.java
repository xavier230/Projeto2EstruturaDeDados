package br.unipar.sistemabancario.models;

/**
 *
 * @author renat
 */
public class Conta {

    private int id;
    private String nome;
    private int  numeroCont;
    private double saldo;
    private double saldoAtualizado;
    private double saldoDeposito;
    private double saldoSaque;
    private double saldoBancos;

    public Conta() {
    }

    public Conta(int id, String nome, int numeroCont, double saldo, double saldoAtualizado, double saldoDeposito, double saldoSaque, double saldoBancos) {
        this.id = id;
        this.nome = nome;
        this.numeroCont = numeroCont;
        this.saldo = saldo;
        this.saldoAtualizado = saldoAtualizado;
        this.saldoDeposito = saldoDeposito;
        this.saldoSaque = saldoSaque;
        this.saldoBancos = saldoBancos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCont() {
        return numeroCont;
    }

    public void setNumeroCont(int numeroCont) {
        this.numeroCont = numeroCont;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoAtualizado() {
        return saldoAtualizado;
    }

    public void setSaldoAtualizado(double saldoAtualizado) {
        this.saldoAtualizado = saldoAtualizado;
    }

    public double getSaldoDeposito() {
        return saldoDeposito;
    }

    public void setSaldoDeposito(double saldoDeposito) {
        this.saldoDeposito = saldoDeposito;
    }

    public double getSaldoSaque() {
        return saldoSaque;
    }

    public void setSaldoSaque(double saldoSaque) {
        this.saldoSaque = saldoSaque;
    }

    public double getSaldoBancos() {
        return saldoBancos;
    }

    public void setSaldoBancos(double saldoBancos) {
        this.saldoBancos = saldoBancos;
    }

    public void saldoBancos(){
    saldoBancos += saldo +  saldoAtualizado;
    }
    
    public void Deposito (){
    saldoDeposito += saldo;
    }
    public void Saque(){
    saldoSaque += saldoBancos + saldoAtualizado;
    }
    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", nome=" + nome + ", numeroCont=" + numeroCont + ", saldo=" + saldo + ", saldoAtualizado=" + saldoAtualizado + ", saldoDeposito=" + saldoDeposito + ", saldoSaque=" + saldoSaque + ", saldoBancos=" + saldoBancos + '}';
    }

    

    
    
}

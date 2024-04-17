//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        if(valor < saldo){
            saldo += valor;
            System.out.println("Saldo depositado com sucesso seu valor agora é de: " + saldo);

        }
        else{
            System.out.println("Tentativa de depósito acima do saldo permitido");
        }
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Voce esta tentando sacar um dinheiro acima do que voce possui");
        }
        else{
            saldo -= valor;
            System.out.println("saldo sacado com sucesso seu saldo total agora é de: " + saldo);
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual de: " + getSaldo());
    }
}

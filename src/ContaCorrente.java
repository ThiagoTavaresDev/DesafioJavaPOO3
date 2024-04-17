public class ContaCorrente extends ContaBancaria{
    private int tarifaFixa;
    private int mes;
    public void cobrarTarifaMensal(){
        tarifaFixa = 10;
        saldo -= tarifaFixa;
        mes++;
        System.out.println("foi cobrada a tarifa fixa de " + tarifaFixa + " seu saldo atual na conta corrente  é de " + saldo);
    }
}

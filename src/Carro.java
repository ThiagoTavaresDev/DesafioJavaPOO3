//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.


public class Carro {
    protected String nomeModelo;
    protected double[] precosMedios = new double[3];
    protected int contadorAno = 0;

    public Carro(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecoMedio(double precoMedio) {
        if (contadorAno < 3) {
            precosMedios[contadorAno] = precoMedio;
            contadorAno++;
        } else {
            System.out.println("Você já definiu os preços para os três anos permitidos.");
        }
    }

    public void mostraMenorPreco() {
        double menorPreco = precosMedios[0];
        for (double preco : precosMedios) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        System.out.println("Menor preço: " + menorPreco);
    }

    public void mostraMaiorPreco() {
        double maiorPreco = precosMedios[0];
        for (double preco : precosMedios) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        System.out.println("Maior preço: " + maiorPreco);
    }
}
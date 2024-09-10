import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>();
        precos.add(15.99);
        precos.add(23.45);
        precos.add(5.99);
        precos.add(99.99);
        precos.add(45.50);
        precos.add(60.25);
        precos.add(70.0);
        precos.add(34.95);
        precos.add(90.0);
        precos.add(100.75);

        RelatorioMetodos relatorio = new RelatorioMetodos();

        System.out.println("Quantidade de Vendas: " + relatorio.buscarQuantidadeVendas(precos));
        System.out.println("Total de Vendas: " + relatorio.somarVendas(precos));
        System.out.println("Existe o preço 50.0? " + relatorio.buscarPreco(precos, 50.0));
        System.out.println("Maior Preço: " + relatorio.buscarMaiorPreco(precos));
        System.out.println("Menor Preço: " + relatorio.buscarMenorPreco(precos));
        System.out.println("Preços maiores ou iguais a 50.0: " + relatorio.buscarPorPrecoMinimo(precos, 50.0));
    }

}


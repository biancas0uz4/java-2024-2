import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {
    public int buscarQuantidadeVendas(List<Double> precos) {
        return precos.size();
    }

    public double somarVendas(List<Double> precos) {
        double total = 0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }

    public boolean buscarPreco(List<Double> precos, double precoPesquisa) {
        return precos.contains(precoPesquisa);
    }

    public double buscarMaiorPreco(List<Double> precos) {
        double maiorPreco = Double.MIN_VALUE;
        for (double preco : precos) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    public double buscarMenorPreco(List<Double> precos) {
        double menorPreco = Double.MAX_VALUE;
        for (double preco : precos) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    public List<Double> buscarPorPrecoMinimo(List<Double> precos, double precoMinimo) {
        List<Double> precosFiltrados = new ArrayList<>();
        for (double preco : precos) {
            if (preco >= precoMinimo) {
                precosFiltrados.add(preco);
            }
        }
        return precosFiltrados;
    }
}

import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {

    Integer avaliandoSorte(Integer numeroEscolhido) {

        Integer sorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer tentativas = 1;

        while (sorteado != numeroEscolhido) {
            tentativas++;
            sorteado = ThreadLocalRandom.current().nextInt(0, 11);

        }
        return tentativas;
    }

    Integer exibeSomaSorteio(Integer novoEscolhido) {

        Integer sorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer tentativas = 1;

        while (sorteado != novoEscolhido) {
            tentativas++;
            sorteado = ThreadLocalRandom.current().nextInt(0, 11);

        }
    }

}

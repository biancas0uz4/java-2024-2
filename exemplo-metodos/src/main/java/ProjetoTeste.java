import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {

        //Criando um objeto para utilizar seus métodos.

        Utilitaria util = new Utilitaria();

        String nome = "Bob da Silva";

        util.exibirUsuario(nome);

       // util.exibirUsuario("Bia");

        // 01 - Crie um scanner
        // 02 - leia um nome e guarde em uma String
        // 03 - chame o método que exibe o nome usando a string

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();

        util.exibirUsuario(nomeUsuario);




//        System.out.println("*-------*-------*");
//        System.out.println("Usuário logado: " + nomeUsuario);
//        System.out.println("*-------*-------*");

        // 5000 linhas de código que faz muita coisa complexa

//        System.out.println("*-------*-------*");
//        System.out.println("Usuário logado: " + nomeUsuario);
//        System.out.println("*-------*-------*");

//        System.out.println("""
//                *-------*-------*
//                Usuário: %s
//                *-------*-------*
//                """.formatted(nomeUsuario));
    }
}

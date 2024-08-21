import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); // está fazendo uma ipt dentro do sistema
        // parametros = argumentos

        //Loja minhaLoja = new  Loja();

//        System.out.println("Digite seu nome:");
//        String nomeUsuario = leitor.nextLine();
//
//        System.out.println("""
//             O nome digitado foi %s""".formatted(nomeUsuario));

        //Pergunte nome, idade, e altura e exiba usando interpolação

        System.out.println("Digite seu nome:");
        String nomeUser = leitor.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();

        System.out.println("""
                Meu nome é %s, tenho %d anos, e %.2f de altura""".formatted(nomeUser, idade, altura));





    }
}

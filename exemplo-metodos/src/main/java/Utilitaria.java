public class Utilitaria {

    //Método
    //Retorno: esse é void, sem retorno
    //nome: exibirUsuario
    //argumentos: nomeUsuario
    //corpo: faz um print enfeitando com o nome

    void exibirUsuario(String nome){
        System.out.println(""" 
                *-------*-------*
                Usuário: %s
                *-------*-------*
                """.formatted(nome));
    }
}

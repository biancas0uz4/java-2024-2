public class ExemploRevisao {
    public static void main(String[] args) {
        //Tipos que mais usaremos:

        // Tipos Wrapper = são classes,ou seja
        // possuem métodos que ajudam
        // Valor inicial de Wrapper = null (não tem)

        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;
        String nomePet;
        nomePet = "Teste";

        // Somente print
        System.out.println("Meu nome é " + nome
                  + ",minha altura é " + altura
                + "\n e minha idade é " + idade);

        // Println usando interpolação
        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome, altura, idade));

        //Println usando inter e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do pet: %s
                """.formatted(nome,idade,altura, "Caramelo"));


        // Não usaremos
        // Tipo primitivo, não são classe, sem métodos
        // sempre tem valor inicial!

        boolean bloqueado02 = false;
        int numero = 42;
    }
}

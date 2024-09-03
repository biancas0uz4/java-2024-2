public class Teste {
    public static void main(String[] args) {
        MetodosDivertidos metodos = new MetodosDivertidos();

        Integer tentativasNecessarias =
                metodos.avaliandoSorte(7);

        System.out.println("""
                Tentativas usadas: %d""".formatted(tentativasNecessarias));

        if(tentativasNecessarias <= 3){
            System.out.println("Você é MUITO sortudo");
        }else if(tentativasNecessarias >=4 && tentativasNecessarias <= 10){
            System.out.println("Você é sortudo");
        }else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}

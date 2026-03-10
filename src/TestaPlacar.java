public class TestaPlacar {

    public static void main(String[] args) {

        Placar jogo = new Placar("Lakers", "Bulls");

        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 1);

        System.out.println(jogo);

        jogo.proximoQuarto();

        jogo.registrarPonto("visitante", 2);

        System.out.println(jogo);
    }
}
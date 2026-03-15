package ClassesObjeto;

public class TestaArCondicionado {

    public static void main(String[] args) {

        // Instanciando objeto
        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 22);

        // Tentando temperaturas inválida e válida
        ar.ajustarTemperatura(10);
        ar.ajustarTemperatura(25);

        // Imprimindo dados
        System.out.println(ar);

        // Tentando modo turbo desligado
        ar.modoTurbo();

        // Ligando o aparelho
        ar.ligar();

        // Ativando modo turbo
        ar.modoTurbo();

        // Estado final
        System.out.println("\nEstado final do aparelho:");
        System.out.println(ar);
    }
}
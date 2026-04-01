package HerancaPolimorfismo;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana");
        devs[1] = new Pleno("Bruno");
        devs[2] = new Senior("Carlos");
        devs[3] = new Desenvolvedor("Davi");

        for (Desenvolvedor d : devs) {
            d.codar();
            System.out.println("Bônus: " + d.calcularBonus());
            System.out.println(d.toString());
            System.out.println("-----------------------");
        }
    }
}
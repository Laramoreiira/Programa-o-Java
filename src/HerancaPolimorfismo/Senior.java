package HerancaPolimorfismo;

public class Senior extends Desenvolvedor {

    public Senior(String nome) {
        super(nome);
    }

    @Override
    public void codar() {
        System.out.println("Senior resolvendo problemas complexos...");
    }

    @Override
    public double calcularBonus() {
        return 2000;
    }
}
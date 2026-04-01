package HerancaPolimorfismo;

public class Pleno extends Desenvolvedor {

    public Pleno(String nome) {
        super(nome);
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando com autonomia...");
    }

    @Override
    public double calcularBonus() {
        return 1000;
    }
}
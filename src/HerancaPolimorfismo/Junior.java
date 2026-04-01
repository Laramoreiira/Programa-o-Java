package HerancaPolimorfismo;

public class Junior extends Desenvolvedor {

    public Junior(String nome) {
        super(nome);
    }

    @Override
    public void codar() {
        System.out.println("Junior codando tarefas simples...");
    }

    @Override
    public double calcularBonus() {
        return 500;
    }
}
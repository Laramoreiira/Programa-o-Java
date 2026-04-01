package HerancaPolimorfismo;

public class Desenvolvedor {
    String nome;

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    public void codar() {
        System.out.println("Desenvolvedor está codando...");
    }

    public double calcularBonus() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome;
    }
}
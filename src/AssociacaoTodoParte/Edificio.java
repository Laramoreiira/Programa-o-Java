package AssociacaoTodoParte;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos = new ArrayList<>();

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void construirApartamento(int num, int andar) {
        apartamentos.add(new Apartamento(num, andar));
    }
}
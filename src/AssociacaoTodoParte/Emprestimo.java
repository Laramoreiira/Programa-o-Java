package AssociacaoTodoParte;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;
    }

    public String toString() {
        return "Leitor: " + leitor.getNome() +
                "\nLivro: " + livro.getTitulo();
    }
}
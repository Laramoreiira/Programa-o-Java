package ClassesObjeto;

public class Placar{

    String nomeTimeCasa;
    String nomeTimeVisitante;
    int pontosCasa;
    int pontosVisitante;
    int periodoQuarto;

    public Placar(String casa, String visitante) {
        nomeTimeCasa = casa;
        nomeTimeVisitante = visitante;
        pontosCasa = 0;
        pontosVisitante = 0;
        periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {

        if (time.equals("casa")) {
            pontosCasa += tipo;
        } else if (time.equals("visitante")) {
            pontosVisitante += tipo;
        }
    }

    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo terminou.");
        }
    }

    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" +
                pontosVisitante + "] " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}
package AssociacaoTodoParte;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime data;
    private double valor;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, double valor, Medico medico, Paciente paciente) {
        this.data = data;
        this.valor = valor;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String toString() {
        return "Consulta em: " + data +
                "\nMédico: " + medico.getNome() +
                "\nPaciente: " + paciente.getNome() +
                "\nValor: " + valor;
    }
}
package AssociacaoTodoParte;

import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args) {

        // Clínica
        Medico m = new Medico(1, "João", "Cardiologista");
        Paciente p = new Paciente(1, "Maria", "123");
        Consulta c = new Consulta(
                LocalDateTime.of(2026,5,20,10,0),
                200,
                m,
                p
        );
        System.out.println(c);

        // Cinema
        Filme f1 = new Filme(1, "Batman", "Ação", 120);
        Sessao s = new Sessao(1,
                LocalDateTime.of(2026,7,20,20,0),
                1);

        s.vincularFilme(f1);
        s.venderIngresso(1,"A1","Inteira",30);
        s.venderIngresso(2,"A2","Meia",15);
        s.venderIngresso(3,"A3","Inteira",30);

        s.imprimir();

        //

    }
}
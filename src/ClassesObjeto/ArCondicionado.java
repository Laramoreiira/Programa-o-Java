package ClassesObjeto;

public class ArCondicionado {

    // Atributos privados
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    // Construtor sem parâmetros
    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    // Construtor com parâmetros
    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = false;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    // Regra da temperatura entre 16 e 30
    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: Temperatura deve estar entre 16°C e 30°C.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Métodos públicos
    public void ligar() {
        ligado = true;
        System.out.println("Ar condicionado ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar condicionado desligado.");
    }

    public void ajustarTemperatura(int novaTemp) {
        if (ligado) {
            setTemperatura(novaTemp);
        } else {
            System.out.println("Não é possível ajustar a temperatura. O aparelho está desligado.");
        }
    }

    public void modoTurbo() {
        if (ligado) {
            processarResfriamentoRapido();
        } else {
            System.out.println("Não é possível ativar o modo Turbo. O aparelho está desligado.");
        }
    }

    // Método privado
    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        setTemperatura(16);
        System.out.println("Temperatura ajustada para 16°C.");
    }

    // toString
    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura + "°C" +
                "\nStatus: " + (ligado ? "Ligado" : "Desligado");
    }
}
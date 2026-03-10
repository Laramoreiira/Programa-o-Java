public class TestaStreaming {

    public static void main(String[] args) {

        Streaming s1 = new Streaming("Carlos", "Premium");

        System.out.println(s1);

        s1.assistirFilme("Vingadores");

        System.out.println(s1);

        s1.cancelarAssinatura();

        s1.assistirFilme("Avatar");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
      
        String primeiroNome = "Daniel";
        String segundoNome = "Rodrigues";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O nome completo e: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

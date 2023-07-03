public class App {
    public static void main(String[] args) throws Exception {

        int mediaFinal = 9;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6){
            System.out.println("PROVA FINAL");
            System.out.println("Se torou!");
            }
        else{
            System.out.println("APROVADO");
            System.out.println("PASSOU DE ANO");
        }
    }  

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "O nome completo e: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

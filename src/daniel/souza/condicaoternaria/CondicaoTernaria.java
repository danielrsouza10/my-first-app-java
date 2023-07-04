package daniel.souza.condicaoternaria;

public class CondicaoTernaria {
    public static void main(String[] args) {
        double nota = 4.9;
        String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >=5 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}

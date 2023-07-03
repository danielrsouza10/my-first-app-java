package daniel.souza.operadores;

public class Operadores {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;
   

        String nomeUm = "Daniel";
        String nomeDois = new String("Daniel");

        // boolean resultadoNomes = nomeUm == nomeDois ? true : false;
        boolean resultado = nomeUm == nomeDois ? true : false;
        System.out.println(resultado);

        //para objetos é importante que se use o equals pois ele compara corretamente os conteudos
        System.out.println(nomeUm.equals(nomeDois));
        
        // System.out.println(resultado);
    }
}

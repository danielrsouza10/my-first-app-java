package daniel.souza.Excessoes;

public class FormatadosCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("741401000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP e invalido");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
         return "74.140-100";
    }
}

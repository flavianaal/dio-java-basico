public class MinhaClasse {

    /*
     * por padrao todas as primeiras letras dos nomes das classes comecaram com
     * letras maisculas
     */

    public static void main(String[] args) {

        String primeiroNome = "Flaviana";
        String segundoNome = "Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

public class ResultadoEscolar {

    public static void main(String[] args) {
        
        int nota = 6;

        // REFACTOR
        //String resultado = nota >=7 ? "Aprovado!" : "Reprovado!"; 

        // REFACTOR IF-ESLE IF-ELSE
        String resultadoFinal = nota >=7 ? "Aprovado!" : nota >=5 && nota < 7 ? "Recuperação!" : "Reprovado!";

        System.out.println(resultadoFinal);

        // if (nota >= 7)
        //     System.out.println("Aprovado!");
        // else if (nota >= 5 && nota < 7)
        //     System.out.println("Recuperação!");
        // else
        //     System.out.println("Reprovado!");
        
        



    }
}
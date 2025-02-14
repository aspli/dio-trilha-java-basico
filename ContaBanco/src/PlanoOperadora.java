public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        // Switch Case sem break (melhores práticas)
        // Classificação dos case em ordem decrescente de valores "Planos" (Total, Médio, Básico)
        switch (plano) {
            case "T":
                System.out.println("5GB Youtube!");
            case "M":
                System.out.println("Whats e Instragm grátis!");
            case "B":
                System.out.println("100 minutos de ligação!");                
        }
        
    }
}

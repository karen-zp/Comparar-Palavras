public class Comparar {
    public static void main(String[] args) {
        String palavra1 = "Hello";
        String palavra2 = "hello";
        
        compararPalavras(palavra1, palavra2);
    }
    
    public static void compararPalavras(String palavra1, String palavra2) {
        // utilizando equals
        if (palavra1.equals(palavra2))
            System.out.println("As palavras são iguais (considerando case).");
        else
            System.out.println("As palavras são diferentes (considerando case).");
        
        // utilizando equalsIgnoreCase
        if (palavra1.equalsIgnoreCase(palavra2))
            System.out.println("As palavras são iguais (ignorando case).");
        else
            System.out.println("As palavras são diferentes (ignorando case).");
    }
}

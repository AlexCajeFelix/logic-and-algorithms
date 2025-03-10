

public class Palindromo {
    public static void main(String[] args) {
        String palavra = "arara";
        String palavra2 = "Alex";

        System.out.println(verificarPalindromo(palavra));
        System.out.println(verificarPalindromo(palavra2));
    }

    public static boolean verificarPalindromo(String palavra) {
        char[] palavraInvertida = new char[palavra.length()];
        

        for(int i = palavra.length() -1; i >= 0; i--) {
            palavraInvertida[palavra.length() - 1 - i] = palavra.charAt(i);
        }

        return palavra.equals(new String(palavraInvertida));
    }
}

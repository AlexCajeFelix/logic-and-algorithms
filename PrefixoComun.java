import java.util.Arrays;

public class PrefixoComun {
    public static void main(String[] args) {
        String[] array1 = {"flor", "fluxo", "flash"};
        String[] array2 = {"odor", "kjdas", "flash"};
        System.out.println(menorPrefixo(array2));
    }

    public static String menorPrefixo(String[] array1){
        String result = "";
        Arrays.sort(array1);
        String primeira = array1[0];
        String ultima = array1[array1.length - 1];
 
        for (int i = 0; i < Math.min(primeira.length(), ultima.length()); i++) {
            if (primeira.charAt(i) == ultima.charAt(i)) {
                result += primeira.charAt(i);
            } else {
                break; 
            }
        }
        return result;
    }
}

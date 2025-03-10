

import java.util.Arrays;

public class IsAnagrama {
    public static void main(String[] args) {
        System.out.println();
            //Verificando se a palavra e um anagrama anagrama e nagraam 
            
             Boolean result = isAnagram("anagram", "nagaram");
             System.out.println(result);

            }
        
            public static boolean  isAnagram(String s1, String s2) {
                s1 = s1.toLowerCase();
                s2 = s2.toLowerCase();

              String vetorS1[] = s1.split("");
              String vetorS2 [] = s2.split("");

             Arrays.sort(vetorS1);
             Arrays.sort(vetorS2);

             return Arrays.equals(vetorS1, vetorS2)? true : false;
               
    }
}
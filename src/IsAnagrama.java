

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

                if(s1.length() != s1.length()){
                    return false;
                }

              String vetorS1[] = s1.split("");
              String vetorS2 [] = s2.split("");

             Arrays.sort(vetorS1);
             Arrays.sort(vetorS2);

             return Arrays.equals(vetorS1, vetorS2);
    }

    public static boolean isAnagramHashTable(String s1, String s2){
            Map<Character, Integer> strings = new HashMap<>();

        for (char c : s1.toCharArray()) {
            strings.put(c, strings.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {  
            if (!strings.containsKey(c) || strings.get(c) == 0) {  
                return false;  
            }  
            strings.put(c, strings.get(c) - 1);  
        }
                return true;
            }
        
           

}
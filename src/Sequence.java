


public class App {
    public static void main(String[] args) {
      
        int[] array1 = {1, 1, 1, 1, 0};
        int count = 0;
        int maxcount = 0;

        for(int i = 0; i < array1.length ; i++ ){
            if(array1[i] == 1){
                count ++;
                maxcount = Math.max(maxcount, count);
                }
                else{
                    count = 0;
                }
            }
            System.out.println("A maior sequência de 1s é: " + maxcount);
        }

        
    }
    

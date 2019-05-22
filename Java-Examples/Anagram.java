package JavaPractice;

import java.util.Scanner;
import java.util.HashMap; 
import java.util.Map; 

public class Anagram {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }

        // Complete the function
        a= a.toLowerCase();
        b = b.toLowerCase();

        // Create Map
        Map<Character,Integer> charMap = new HashMap<>();

        for (int k = 0; k<a.length();k++){
            char letter = a.charAt(k);
            
            if(!charMap.containsKey(letter)){
                charMap.put(letter, 1);
            }
            else{
                Integer frequency = charMap.get(letter);
                charMap.put( letter, ++frequency );
            }
        }

        for(int k=0; k<b.length();k++){
            char letter = b.charAt(k);

        if(!charMap.containsKey(letter)){
            return false;
        }
        Integer frequency = charMap.get( letter );
          if( frequency == 0 )
        return false;
    else    
    	charMap.put( letter, --frequency);
        }
        return true;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

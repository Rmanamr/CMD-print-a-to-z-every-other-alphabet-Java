/*Print a to z every other alphabet*/

import java.util.ArrayList;
import java.util.List;

public class AToZPrintEveryotherAlphabet{
    public static void main(String[] args){
        List<Character> characters = aToZeveryotherAlphabet();
        for(char alphabet : characters){
            System.out.println(alphabet);
        }
    }

    public static List<Character> aToZeveryotherAlphabet(){
        List<Character> result = new ArrayList<>();
        for(char letter = 'a'; letter<='z'; letter+=2){
            result.add(letter);
        }
        return result;
        }
}


// by Arman Azarnik
// armanazarnik@gmail.com
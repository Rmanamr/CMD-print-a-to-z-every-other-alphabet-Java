import java.util.ArrayList;
import java.util.List;

/**Java CMD program for printing Print a to z every other alphabet.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Print_A_To_Z_Every_Other_Alphabet{
    public static void main(String[] args){
        List <Character> characters = a_To_Z_Every_Other_Alphabet();
        for(char alphabet : characters){
            System.out.println(alphabet);
        }
    }

    /** 
     * method for adding a to z everyother alphabet to an array list.
     * @return result  an array of a to z everyother alphabe
     * <pre>
     *      a_To_Z_Every_Other_Alphabet(); // Output: [a, c, e, ..., w, y]
     * </pre>
    */
    public static List <Character> a_To_Z_Every_Other_Alphabet(){
        List <Character> result = new ArrayList<>();
        for(char letter='a'; letter<='z'; letter+=2){
            result.add(letter);
        }
        return result;
        }
}
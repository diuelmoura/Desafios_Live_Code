/*ENUNCIADO DESAFIO 1 - First Unique Character
Write a function/method to find the first unique in a HUGE string
Solve it in an optiized way
Example:
Input: "axaaababawaax"
Output: x
*/

public class FirstUniqueCharacter {

    public static char firstUnique(String word){
        
        int[] freq = new int[256];

        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i)]++;
        }

        for(int i = 0;i < word.length();i++){
             if (freq[word.charAt(i)] == 1) {
                return word.charAt(i);
             }       
        }
        return '\0';
    }
    public static void main(String[] args) {
        String word = "axaaababawaax";

        char result = firstUnique(word);

        if (result != '\0') {
            System.out.println("O Primeiro caractere único é: " + result);
        } else {
            System.out.println("Não existe caractere único.");            
        }
    }
}    
/*
 * The **FirstUniqueCharacter** method takes a String as input and aims to find
 * the first character that appears only once.
 * 
 * Next, I create an auxiliary array named **freq**, which will be used to store
 * the count of each character's occurrences in the String.
 * 
 * Then, I iterate through the entire String for the first time. For each
 * character encountered, I increment its corresponding position in the **freq**
 * array, thereby recording its frequency.
 * 
 * After completing the count, I iterate through the String again, maintaining
 * the original character order.
 * 
 * For each character, I check the **freq** array to see if its frequency is
 * equal to **1**. When this condition is met, it means I have found the first
 * non-repeating character, and I return that character.
 * 
 * If I traverse the entire String without finding any character with a
 * frequency of 1, I return **'\0'**, indicating that no unique character
 * exists.
 * 
 * Thus, the String is traversed only twice, resulting in **O(n)** time
 * complexity, making it an efficient solution even for very large Strings.
 */


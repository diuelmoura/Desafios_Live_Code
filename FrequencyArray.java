/*CHALLENGE STATEMENT 2 - Frequency Array
Write a function/method tjat receives a String and counts the frequency of each character.

The function should use a Frequency Array to store how many times each characters that appear at least once.

Solve it in an optimized way.

Example:
Input: "banana"
Output:
a = 3
b = 1
n = 2
*/

public class FrequencyArray {

    public static int[] countFrequency(String word){
        
        int[] freq = new int[256];
        
        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i)]++; 
        }
        return freq;
    }
    public static void main(String[] args) {
        
        String word = "banana";

        int[] result = countFrequency(word);

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println((char) i + " = " + result[i]);
            }
        }
    }
}

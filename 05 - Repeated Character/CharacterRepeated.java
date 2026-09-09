/*CHALLENGE - REPEATED CHARACTER
Write a function "solution" that, given a String S of length N, checks if there is at one repeated character.
The function
*/

public class CharacterRepeated {

    public static boolean solution(String word){

        int[] freq = new int[26];

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            freq[index]++;

            if (freq[index] > 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(solution("banana")); // true
        System.out.println(solution("casa"));   // true
        System.out.println(solution("java"));   // true
        System.out.println(solution("code"));   // false
        System.out.println(solution("abcde"));  // false
    }
    
}

/*
 * The **solution** method takes a String **S** as input and aims to determine
 * whether the String contains any repeated characters.
 *
 * First, I create an integer array named **freq** with 26 positions,
 * because the input contains only lowercase letters from 'a' to 'z'.
 *
 * Each position of the **freq** array represents one letter of the alphabet.
 * Position 0 represents 'a', position 1 represents 'b', position 2 represents
 * 'c', and so on.
 *
 * Next, I iterate through the String using a **for** loop.
 *
 * For each position, I use **charAt(i)** to get the current character
 * and store it in the variable **c**.
 *
 * Then, I calculate the position of this character inside the frequency
 * array using **c - 'a'**.
 *
 * For example:
 * 'a' - 'a' = 0
 * 'b' - 'a' = 1
 * 'c' - 'a' = 2
 *
 * After finding the correct position, I increment its frequency using
 * **freq[index]++**.
 *
 * Then, I check whether **freq[index]** is greater than 1.
 *
 * If it is greater than 1, it means that the current character has already
 * appeared before in the String. Therefore, I immediately return **true**.
 *
 * If the loop finishes without finding any repeated character, I return
 * **false**.
 *
 * Thus, the String is traversed only once, resulting in **O(n)** time
 * complexity.
 *
 * Since the frequency array always contains only 26 positions, the auxiliary
 * space complexity is **O(1)**.
 */
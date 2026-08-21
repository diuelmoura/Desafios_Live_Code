/*CHALLENGE STATEMENT 3 - Valid Anagram

Write a function/method that receives two Strings and determines
whether they are valid anagrams.

Two Strings are anagrams if they contain exactly the same characters
with the same frequencies, but possibly in a different order.

Solve it in an optimized way.

Example 1:
Input:
word1 = "listen"
word2 = "silent"

Output:
true

Example 2:
Input:
word1 = "hello"
word2 = "world"

Output:
false
*/

public class ValidAnagram {

    public static boolean isAnagram(String word1, String word2){
        
        if(word1.length() != word2.length()){
            return false;
        }

        int[] freq = new int[256];

        for(int i = 0; i < word1.length(); i++){
            freq[word1.charAt(i)]++;
        }

        for(int i = 0; i < word2.length(); i++){
            fre
        }
    } 

}

/*
 * The **isAnagram** method takes two Strings as input and aims to determine
 * whether they are valid anagrams.
 *
 * First, I compare the lengths of the two Strings. If their lengths are
 * different, I immediately return **false**, because two anagrams must contain
 * the same number of characters.
 *
 * Next, I create an auxiliary array named **freq**, which will be used to
 * store the frequency of each character.
 *
 * Then, I iterate through **word1**. For each character encountered,
 * I increment its corresponding position in the **freq** array.
 *
 * After that, I iterate through **word2**. For each character encountered,
 * I decrement its corresponding position in the **freq** array.
 *
 * If both Strings contain exactly the same characters with the same
 * frequencies, all positions in the **freq** array should return to zero.
 *
 * Finally, I iterate through the **freq** array. If I find any position
 * different from zero, I return **false**, because this means that one
 * character appears a different number of times in the two Strings.
 *
 * If all positions are equal to zero, I return **true**, indicating that
 * the two Strings are valid anagrams.
 *
 * Thus, the Strings are traversed once each, resulting in **O(n)** time
 * complexity. Since the **freq** array has a fixed size, the auxiliary
 * space complexity is **O(1)**.
 */
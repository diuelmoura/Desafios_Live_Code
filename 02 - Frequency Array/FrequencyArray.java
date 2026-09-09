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
    public static void main(String[] args){
        String word = "banana";

        int[] result = countFrequency(word);

        for(int i = 0; i < result.length; i++){
            if (result[i] > 0) {
                System.err.println((char) i + " = " + result[i]);
            }            
        }

    }
}
/*
The countFrequency method takes a String as input and aims to cout how many times each character appears in the String.
First, I create an auxiliary array named "freq" with 256 positions.

This array is used to store the frequency of each chacacter.
Each positions of the "freq" array represents a character according to its numeric value.

Then, I iterate through the entire String using a "for" loop.
For each character, "word.charAt(i)" retrives the character at the current position.
The numeric value of this of this character is used as an index the "freq" array.

Then, I increment that position by one:

    freq[word.charAt(i)]++;

For example, if the current character is 'a', its numeric value is 97, so the operation is equivalent to:

    freq[97]++;

After traversing the entire String, the "freq" array contains the number of occurrences of each character.
The method then returns the "freq" array.
In the "main" method, I iterate through the returned array and check which positions contain a value greater than zero

When a value is greater than zero, I convert the array index back to a character using:

    (char) i

Then, I display the character and its frequency.

Thus, the String is traversed once to count the characters, resulting in "O(n)" time complexitey

Since the "freq" array has a fixed size of 256 positions, the auxiliary space complexity is 0(1).
*/

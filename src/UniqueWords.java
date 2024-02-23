/* Project: Lab 2, Git
 * Class: UniqueWords
 * Author: Tomas Santos Yciano
 * Date: 02/19/2024
 * 
 * In this project, I have completed the countUnique method in order to properly count the amount of unique
 * words in a list.
 */
import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		// Set up
		int count = 0;

		// Nested for loop
		for (int i = 0; i < list.size(); i++) {
			boolean isWordUnique = true; // Setting this to true for each iteration and word
			for (int j = 0; j < list.size(); j++) {
				// Check to see if word at position i is equal to any other word in list.
				if (i != j && list.get(i).equals(list.get(j))) {
					isWordUnique = false; // Word is NOT unique!
					break;
				}
			}
			// If the words ARE unique, increment the counter
			if (isWordUnique) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// Testing in main method, added the words "football" and "basketball"
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");
		words.add("football");
		words.add("basketball");

		int unique = countUnique(words);
		// With the current list of words, returns that there are 5 unique words in the list.
		System.out.println(words + " has " + unique + " unique words");
	}
}

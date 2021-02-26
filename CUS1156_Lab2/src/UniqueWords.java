
/* Project:  Lab2
 * Class:	 UniqueWord.java
 * Author:   Britney Creamer
 * Date:     February 26, 2021
 * This program prints out the number of unique words within an ArrayList of
 * strings.
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
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			int wordAppearances = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equalsIgnoreCase(list.get(j))) {
					wordAppearances++;
				}
			}
			if (wordAppearances == 1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}

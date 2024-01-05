package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LetterCount {

	public static void main(String[] args) {

		String str = "I love Java coding";
		Integer count;

		char[] chararray = str.toCharArray();
		Map<Character, Integer> lettercount = new HashMap<>();

		for (char ch : chararray) {
			if (lettercount.containsKey(ch)) {
				count = lettercount.get(ch);
				count = count + 1;
				lettercount.put(ch, count);
			} else {
				lettercount.put(ch, 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : lettercount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}

}

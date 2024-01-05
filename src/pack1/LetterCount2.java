package pack1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterCount2 {

	public static void main(String[] args) {

		String str = "I love Java Coding";
		String str1[] = str.split("");

		//List<String> ls = Arrays.stream(str1).map(s -> s.toUpperCase()).collect(Collectors.toList());

		//System.out.println(ls);

		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(result);
		
		for (Map.Entry<String, Long> entry : result.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}


	}

}
}

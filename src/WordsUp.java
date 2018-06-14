import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordsUp {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = "When I was younger I never need time to sleep";
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			Character space = array[i];
			array[0] = Character.toUpperCase(array[0]);

			if (space.equals(' ')) {
				array[i + 1] = Character.toUpperCase(array[i + 1]);
			}
		}
		System.out.println(array);
	}

}
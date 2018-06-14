import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr = new int[200];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random());
		}

		for (int i = 1; i < arr.length; i++) {
			int count = 0;

			if (arr[i - 1] > arr[i]) {
				int exchangeToTheNextPosition = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = exchangeToTheNextPosition;
				count++;
			}
			if (count > 0) {
				i = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
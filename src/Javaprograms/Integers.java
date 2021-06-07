package Javaprograms;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Integers {
	public static void main(String[] args) {
		System.out.println("Printing Integers with Consumer Interface");
		for (int i = 1; i <= 10; i++) {

			if (i > 7 || i < 3) {
				java.util.List<Integer> li = new ArrayList<>();
				li.add(i);
				Consumer<Integer> c = (Integer k) -> {
					System.out.println(k);
				};
				li.forEach(c);

			}

		}
	}
}

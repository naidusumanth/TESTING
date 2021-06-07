package Javaprograms;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
public class DoubleNumbers {
	public static void main(String[] args) {
		System.out.println("Printing Integers with Consumer Interface");
		for (int i = 1; i <= 10; i++) {
				java.util.List<Integer> li = new ArrayList<>();
				li.add(i*2);
				Consumer<Integer> c = (Integer k) -> {
					System.out.println(k);
				};
				li.forEach(c);
		}
	}

}


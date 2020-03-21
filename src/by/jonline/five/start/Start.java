package by.jonline.five.start;

import by.jonline.five.composition.Composition;
import by.jonline.five.composition.CompositionBuilder;

public class Start {

	public static void main(String[] args) {
		CompositionBuilder cb = new CompositionBuilder();
		cb.addFlowers("роза 3");
		cb.addFlowers("ромашка 5");
		cb.addPack("бумага");
		Composition comp = cb.getComposition();
		
		System.out.println(comp.getPrice());
		System.out.println(comp.toString());
	}
}

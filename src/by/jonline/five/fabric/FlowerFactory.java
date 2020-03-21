package by.jonline.five.fabric;

import by.jonline.five.flower.Chamomile;
import by.jonline.five.flower.Flower;
import by.jonline.five.flower.Rose;

public class FlowerFactory {

	public static Flower[] create(String name, int quantity) throws NullPointerException {
		Flower[] flowers = new Flower[quantity];
		for (int i = 0; i < quantity; i++) {
			flowers[i] = create(name);
		}
		
		return flowers;
	}
	
	private static Flower create(String name) throws NullPointerException {
		switch (name) {
		case "роза" : return new Rose(10, "красный", "роза");
		case "ромашка" : return new Chamomile(2, "белый", "ромашка");
		// TODO add other flowers;
		default : throw new NullPointerException();
		}
	}
}

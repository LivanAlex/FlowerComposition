package by.jonline.five.composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.jonline.five.flower.Flower;
import by.jonline.five.pack.Pack;

public class Composition {
	private List<Flower> flowers = new ArrayList<>();
	private Pack pack;
	private int price;
	
	protected void addFlowers(Flower[] flowers) {
		Arrays.stream(flowers).forEach(this.flowers::add);
		Arrays.stream(flowers).forEach(this::sum);
	}
	protected void addPack(Pack pack) {
		this.pack = pack;
		price += pack.getPrice();
	}
	
	private void sum(Flower flower) {
		price += flower.getPrice();
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Composition [flowers=" + flowers + ", pack=" + pack + ", price=" + price + "]";
	}
	
	
}

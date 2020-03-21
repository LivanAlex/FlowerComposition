package by.jonline.five.composition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jonline.five.fabric.FlowerFactory;
import by.jonline.five.fabric.PackFactory;
import by.jonline.five.flower.Flower;

public class CompositionBuilder {
	
	
	private Composition composition;

	public CompositionBuilder() {
		composition = new Composition();
	}
	
	public void addFlowers(String userInput) {
		UserInput input = userInputWordAndNum(userInput);
		try {
			Flower[] flowers = FlowerFactory.create(input.name, input.quantity);
			composition.addFlowers(flowers);
		} catch (NullPointerException e){
			System.out.println("Таких цветов у нас нет!");
		}		
	}
	
	public void addPack(String userInput) {
		String input = userInputWord(userInput);
		try {
			composition.addPack(PackFactory.create(input));
		} catch (NullPointerException e){
			System.out.println("Таких цветов у нас нет!");
		}		
	}
	
	public Composition getComposition() {
		return composition;
	}
	
	public void clear() {
		composition = new Composition();
	}
	
	private UserInput userInputWordAndNum(String userInput) {
		
		Pattern patAmount = Pattern.compile("[\\d]+"); //TODO
		Matcher matAmount = patAmount.matcher(userInput);

		int quantity = 0;
		quantity = Integer.parseInt(matAmount.find() ? matAmount.group() : "0");

		UserInput input = new UserInput();
		
		input.name = userInputWord(userInput);
		input.quantity = quantity;
		
		if(input.name == null || input.quantity == 0) {
			return null;
		} else {
			return input;
		}
	}
	
	
	private String userInputWord(String userInput) {
		Pattern patName = Pattern.compile("[А-Яа-я]+");
		Matcher matName = patName.matcher(userInput);

		String name = matName.find() ? matName.group() : null;
		return name;
	}
	
	
}

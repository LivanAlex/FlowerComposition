package by.jonline.five.fabric;

import by.jonline.five.pack.Pack;
import by.jonline.five.pack.Cellophane;
import by.jonline.five.pack.Paper;

public class PackFactory {
	
	public static Pack create(String name) {
		switch (name) {
		case "бумага" : return new Paper("бумага", 32);
		case "целофан" : return new Cellophane("целофан", 46);
		default : return null;
		}
	}
}

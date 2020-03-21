package by.jonline.five.pack;

public class Pack {
	private String material;
	private int price;
	
	public Pack(String material, int price) {
		this.material = material;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int value) {
		this.price = value;
	}

	@Override
	public String toString() {
		return "Pack [material=" + material + ", price=" + price + "]";
	}
	
	
}

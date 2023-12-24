package Extractdata;
public class Product {
	private String title;
	private String Price;
	public Product(String Title,String Price) {
		this.title=Title;
		this.Price=Price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(String Price) {
	this.Price = Price;
	}
	public String getPrice() {
		return Price;
	}
	
}

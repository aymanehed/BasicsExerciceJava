
	import java.io.IOException;
	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document;
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;

	public class WebScraping {
	    public static void main(String[] args) {
	        String url = "https://example.com/products"; // replace with the URL of the website you want to scrape
	        try {
	            Document doc = Jsoup.connect(url).get();
	            Elements products = doc.select(".product"); // replace ".product" with the CSS selector for the element containing product details
	            for (Element product : products) {
	                String title = product.select(".title").text(); // replace ".title" with the CSS selector for the element containing the product title
	                String price = product.select(".price").text(); // replace ".price" with the CSS selector for the element containing the product price
	                System.out.println("Title: " + title);
	                System.out.println("Price: " + price);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

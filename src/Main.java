import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * will run main method for executable JAR file
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// Toolbar toolbar = new Toolbar();
		// DisplayPane display = new DisplayPane(toolbar);
		// Window window = new Window(toolbar, display);
		// window.setVisible(true);

		String url = "http://www.immersive-theatres.com/";
		Element meta;
		String keywords;
		List<Attribute> attributes = new ArrayList<Attribute>();
		
		Document doc = Jsoup.connect(url).get(); // throws IOException
		Elements nodes = doc.getElementsByTag("meta");

		if (nodes.size() > 0) {
			meta = doc.getElementsByAttributeValueMatching("name", "keywords").get(0);
			attributes = meta.attributes().asList();
			for(Attribute attribute: attributes) {
				if(attribute.getKey().equals("content")) {
					keywords = attribute.getValue();
					System.out.println(keywords);
					break;
				}
			}
		} else {
			System.out.println("no meta tags");
		}

	}
}

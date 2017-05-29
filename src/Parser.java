import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will parse the HTML into a Java String
 * class 
 */
public class Parser {
	
	public Parser() {
		
	}

	public String getKeywords(String rivalUrl) {
		List<Attribute> attributes = new ArrayList<Attribute>();
		Element meta;
		String keywords = null;
		
		try {
			Document doc = Jsoup.connect(rivalUrl).get();
			Elements nodes = doc.getElementsByTag("meta");
			
			if(!nodes.isEmpty()) {
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
				System.out.println("No meta tags found");
			}
		} catch (IOException e) {
			System.out.println("IOException handled");
		}
		return keywords;
	}
}

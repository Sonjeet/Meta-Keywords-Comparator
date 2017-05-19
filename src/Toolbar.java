import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will extend the JPanel and be used as a toolbar
 * toolbar will consist of a searchfield and a set-home-URL option
 */
public class Toolbar extends JPanel {

	public Toolbar() {
		addComponents();
	}

	/*
	 * initialising JComponents below
	 * privatised from other classes
	 */
	private final JButton goButton = new JButton("GO"),
			setHomeButton = new JButton("Set the URL for all URLs to be compared against");
	
	private final JTextField searchBar = new JTextField(50);
	
	/*
	 * method adds all JComponents required into the JPanel
	 */
	private void addComponents() {
		add(searchBar);
		add(goButton);
		add(setHomeButton);
	}
	
	/*
	 * getters and setters below
	 * allows other classes to call on private fields from this class
	 */
	public JButton getGoButton() {return goButton;}
	public JButton getSetHomeButton() {return setHomeButton;}
	public JTextField getSearchBar() {return searchBar;}
}

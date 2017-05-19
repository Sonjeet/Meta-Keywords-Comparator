import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will handle the events taken on the toolbar
 * action listeners are set up for each JComponent
 */
public class ToolbarHandler {

	public ToolbarHandler(Toolbar toolbar) {
		toolbar.getSearchBar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				activateSearch(event.getActionCommand());
			}
		});
	}
	
	private void activateSearch(String url) {
		
	}
	
}

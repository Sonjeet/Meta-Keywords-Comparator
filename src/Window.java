import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will extend the JFrame
 * every Swing component will be packed into this frame
 */
public class Window extends JFrame{

	public Window(Toolbar toolbar, DisplayPane display) {
		pack();
		setSize(2000, 1500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(toolbar, BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(display), BorderLayout.CENTER);
	}
}

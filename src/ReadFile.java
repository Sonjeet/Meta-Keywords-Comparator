import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will allow us to read in contents of a .txt file
 */
public class ReadFile {
	
	private String url;
	private Scanner file;
	
	/*
	 * constructor accesses the file
	 * reads in the contents from the text file and stores that data in a variable
	 */
	public ReadFile(File fileName) {
		openFile(fileName);
		readFile();
	}
	
	/*
	 * opens text file as a resource to be accessed later on
	 */
	private void openFile(File fileName) {
		try {
			FileReader fileRead = new FileReader(fileName);
			file = new Scanner(fileRead);			
			fileRead.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found openFile()");
		} catch (IOException e) {
			System.out.println("i/o exception openFile()");
		}
	}
	
	/*
	 * attempts to read in line contents from text file 
	 * line contents stored in a variable if there is content in the text file
	 * if document has null content then handle that condition appropriately
	 */
	private void readFile() {
		if(file.hasNextLine()) 
			setUrl(file.next());
		else
			System.out.println("no line, TODO add method to handle this");
		file.close();
	}
	

	public String getUrl() {return url;}
	private void setUrl(String url) {this.url = url;}
}

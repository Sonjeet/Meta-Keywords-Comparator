import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @author Sonjeet Paul
 * Github https://github.com/sonjeet
 * LinkedIn https://linkedin.com/in/sonjeet/
 * 
 * this class will allow us to write contents to a .txt file
 */
public class Write {
	
	public Write() {}
	
	/*
	 * writes the url to the file with the specified fileName
	 */
	public void writeLine(File fileName, String url) {
		try {
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName));
			outputStream.println(url);
			outputStream.close();
		} catch(FileNotFoundException e) {
			System.out.println("file not found writeline()");
		}
	}
	
	/*
	 * reads in contents from file with fileName
	 * writes that line to a temporary existing text file
	 * leaves the text file without any contents ready to be written to
	 */
	public void removeLine(File fileName) {
		File masterFile = fileName;
		File temporaryFile = new File("temporary.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(masterFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(temporaryFile));
			String currentLine;
			
			while((currentLine = reader.readLine()) != null) {
				writer.write(currentLine + System.getProperty("line.seperator"));
			}
			
			writer.close();
			reader.close();			
		} catch (FileNotFoundException e) {
			System.out.println("file not found removeLine()");
		} catch (IOException e) {
			System.out.println("i/o exception removeLine()");
		}
	}
}

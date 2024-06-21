package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Checked Exception(Compile Time)
class FileReaderDemo {
	public void readFile(String filePath) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("An I/O error ocurred: "+e.getMessage());
		}
	}
}

public class FileNotFoundException {

	public static void main(String[] args) {
		
		FileReaderDemo Obj = new FileReaderDemo();
		Obj.readFile("filepath");
	}
}

// FilePath: C:\\Users\\Admin\\OneDrive\\Desktop\\Job Apply.txt 
package readFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
	 DoesFileExist("E:\\E23300509\\WightWatchers\\Wordbook");
	}
	
    public static String DoesFileExist(String path) {
		String line = " " ;
		try {
		Scanner s = new Scanner (new File (path));
		while (s.hasNextLine()) {
			line = s.nextLine();
			System.out.println(line);
			
		}
	} catch (FileNotFoundException e) {
		System.out.println("File not found");
	}
		return line;
    }
	
}


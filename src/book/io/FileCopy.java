package book.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public void copyFile(String source, String to) throws IOException {
		File sourceFile = new File(source);
		File toFile = new File(to);
		FileReader fr = new FileReader(sourceFile);
		FileWriter fw = new FileWriter(toFile);
		while(fr.read() != -1) {
			fw.write(fr.read());
		}
	}
}

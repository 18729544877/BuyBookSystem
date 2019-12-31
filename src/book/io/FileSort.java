package book.io;

import java.io.File;

public class FileSort {
public static void main(String[] args) {
	System.out.println("file");
	
	outFileFromRootIsC();
}

private static void outFileFromRootIsC() {
	// TODO Auto-generated method stub
	String dir = "c:/";
	File file = new File (dir);
	File[] fs = file.listFiles();
	
	repeatOutFile(fs);
}

private static void repeatOutFile(File[] fs) {
	if(fs != null && fs.length > 0) {
		for(File oneFile : fs) {
			if(oneFile.isDirectory()) {
				fs = oneFile.listFiles();
				repeatOutFile(fs);
			}
			if(oneFile.isFile()) {
			    handleFileStyle(oneFile);
			}
		}
	}
	
}

private static void handleFileStyle(File oneFile) {
	// TODO Auto-generated method stub
//	System.out.print("file Name:" + oneFile.getName());
//	System.out.println(", path=" + oneFile.getPath());
	int lastIndex = oneFile.getName().lastIndexOf(".");
	int nameLen = oneFile.getName().length();
	
	if(lastIndex > -1 && oneFile.getName().substring(lastIndex, nameLen - 1) == "class") {
		System.out.println(oneFile.getPath());
	}
}
}

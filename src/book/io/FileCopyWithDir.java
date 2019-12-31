package book.io;

import java.io.File;
import java.util.Scanner;

public class FileCopyWithDir {
public static void main(String[] args) {
	System.out.println("gole dir:");
	Scanner scann = new Scanner(System.in);
	String dir = scann.nextLine();
	fileCopyWithDir(new File("D:/"), dir);
	
}

private static void fileCopyWithDir(File file, String dir) {
	
	File goleFile = new File (dir);
	
}
}

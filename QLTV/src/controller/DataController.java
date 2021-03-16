package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataController {
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private PrintWriter printWriter;
	private Scanner scanner;
	
	
	public void openFileToWrite(String fileName) {
		try {
			fileWriter = new FileWriter(fileName,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(bufferedWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

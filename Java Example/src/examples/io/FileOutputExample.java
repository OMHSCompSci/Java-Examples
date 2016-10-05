package examples.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args)
	{
		String str = "I want to put this in a file!!!!!!!!!!";
		//The String to be placed in the new file
		File theNewFileDirectory = new File("Z:/Desktop/");
		//Finding the file's folder location (Don't let "File" throw you off)
		if (!theNewFileDirectory.exists())
		{
			theNewFileDirectory.mkdirs();
		}
		File theNewFile = new File(theNewFileDirectory.getPath() + "MyFirstFile.txt");
		//If the file directoy doesn't exist, make a new one!
		try {
			FileWriter fw = new FileWriter(theNewFile);
			fw.write(str);
			fw.flush();
			fw.close();
			//Create a FileWriter to Write to the file
			//Write the *String* str to the file
			//Flush all the data
			//Close the stream (to prevent problems) (dont ask)
			
		} catch (IOException e)
		{
			//If for some reason we still can't find the file, find out why.
			e.printStackTrace();
		}
		
	}
	
}

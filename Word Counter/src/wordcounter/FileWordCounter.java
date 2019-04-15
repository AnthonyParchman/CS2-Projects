package wordcounter;

import java.io.*;

public class FileWordCounter {

	public static void main(String[] args)
	// Will not compile without throws exception don't know why
	throws IOException
	{
		//Defines target file need to double up on backslashes don't know why
		File Target = new File ("C:\\Users\\LAB\\Desktop\\CS2-Projects\\GBA.txt");
		
		//Sets the file input stream, 
		//A FileInputStream obtains input bytes from a file in a file system
		FileInputStream TargetStream = new FileInputStream(Target);
		
		//An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset.
		//The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
		// we use file input stream and no cahar input steam to make import format agnostic?
		InputStreamReader Input = new InputStreamReader(TargetStream);
		
		//Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
		BufferedReader Inspector = new BufferedReader(Input);
		
		//Wont compile without this don't know why
		String Line; 
	
		int WordCount = 0;
		
		//read line by line from the file to a null return 
		
		
		
		while((Line = Inspector.readLine()) !=null){
			if(!(Line.equals("")))
			{
				String[] wordList = Line.split("\\s+"); 
                
                WordCount += wordList.length; 
		
			}
		}
	
		System.out.println("The Word count is " + WordCount);
	}

	
}

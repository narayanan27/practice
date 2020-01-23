package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class throwsexcep {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\training01\\Documents\\selenium works\\files\\throws.txt");
		f.createNewFile();
		FileWriter file = new FileWriter("C:\\\\Users\\\\training01\\\\Documents\\\\selenium works\\\\files\\\\throws.txt");
	    file.write("bcd");
	    file.close();
	      
	      
	}

}

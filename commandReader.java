import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class commandReader {
	public static FileInputStream fileStream;
	public static String mode;

	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println("herrrrrrrr");
		
		String filepath = args[0];

		if(!filepath.endsWith(".md")){
			System.out.println("wrong path!");
			System.exit(0);
		}

		if(args[1]!="-p" || args[1]!="-s" || args[1]!="-f"){
			System.out.println("wrong mode!");
			System.exit(0);
		}
		mode = args[1];
		
		try{
			fileStream = new FileInputStream(filepath);
			System.out.println("file read");
			PrintWriter writer = new PrintWriter(args[2],"UTF-8");
			writer.close();
		}catch(Exception e){
			System.out.println("error");
			System.exit(0);
		}
		
		
		try{
			fileStream.close();
		}catch(Exception e){
			System.out.println("close failure");
			System.exit(0);
		}
		
	}

}

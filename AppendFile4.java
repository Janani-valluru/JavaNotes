
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile4 {
	
	public static void appendtext(String filename , String filedata) {
		
		String path = System.getProperty("user.dir")+ "\\"+filename;
		System.out.println(path);
		
		try {
			
			FileWriter fw = new FileWriter(path,true);
			fw.write(filedata);
			fw.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter filename");
		String filename = sc.nextLine();
		
		System.out.println("enter data");
		String filedata = sc.nextLine();
		appendtext(filename,filedata);
		
		}

	}


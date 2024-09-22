import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileEX1 {

	public static void main(String[] args) throws IOException {
		
		//writing 
		FileWriter fw = new FileWriter("dac");
		
		String s1 ="welcome";
		String s2 =" hiiiii";
		fw.write(s1);
		fw.write(s2);
		
		System.out.println("over");
		fw.close();
		
		//reading
		FileReader fr = new FileReader("dac");
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		boolean str;
		
		while(str = br.readLine() != null) {
			System.out.println(str);
		}

	}

}

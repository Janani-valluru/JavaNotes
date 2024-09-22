import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class ReadWriteStringsFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		BufferedWriter brr = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String s1 =sc.nextLine();
		String s2 =sc.nextLine();
		fw.write(s1);
		fw.write(s2);
		
		System.out.println("over");
		fw.close();
		brr.close();
		sc.close();
		
		//reading
		FileReader fr = new FileReader("output.txt");
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		boolean str;
		
		while(str = br.readLine() != null) {
			System.out.println(str);
		}
	}

}


//this is the best code

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import java.io.IOException;
import java.util.Scanner;

public class DataFile3 {

public static void main(String[] args) throws IOException {
		
		//writing 
	String filename = "primitives.dat";
	try(FileOutputStream fos =  new FileOutputStream(filename);
	 DataOutputStream  dos = new DataOutputStream(fos)){
	 System.out.println("type 1. integer 2. double 3. boolean");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		double b =sc.nextDouble();
		boolean c = sc.nextBoolean();
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeBoolean(c);
		
		
		System.out.println("written");
	}
		
		//reading
		try(FileInputStream fis = new FileInputStream(filename);
		 DataInputStream fr = new  DataInputStream(fis)){
		
			  int readInt = fr.readInt();
			    double readDouble = fr.readDouble();
			    boolean readBoolean = fr.readBoolean();
		 System.out.println("Data read from " + filename + ":");
         
		System.out.println("Integer: " + readInt);
         System.out.println("Double: " + readDouble);
         System.out.println("Boolean: " + readBoolean);
		
		}
		
	
	}
}

//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class DataFile3 {
//
//public static void main(String[] args) throws IOException {
//		
//		//writing 
//	String filename = "primitives.dat";
//	//use try and catch its a good practice
//	
//	FileOutputStream fos =  new FileOutputStream(filename);
//	 DataOutputStream  dos = new DataOutputStream(fos);
//	 System.out.println("type 1. integer 2. double 3. boolean");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(); 
//		double b =sc.nextDouble();
//		boolean c = sc.nextBoolean();
//		dos.writeInt(a);
//		dos.writeDouble(b);
//		dos.writeBoolean(c);
//		
//		
//		System.out.println("written");
//		dos.close();
//		
//		//reading
//		FileInputStream fis = new FileInputStream(filename);
//		 DataInputStream fr = new  DataInputStream(fis);
//		
//		 fr.readInt();
//		 fr.readDouble();
//		 fr.readBoolean();
//		 System.out.println("Data read from " + filename + ":");
//       
//		System.out.println("Integer: " + a);
//       System.out.println("Double: " + b);
//       System.out.println("Boolean: " + c);
//		
//	
//	fr.close();
//	fis.close();
//		
//	
//	}
//}


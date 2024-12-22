package com.features8;
import java.io.*;

public class IOstream {

	public static void main(String[] args) throws IOException{

		try (FileWriter fis=new FileWriter("D:\\io.txt");){
			
		}
		try (FileReader fis=new FileReader("D:\\io.txt");){
			int value=fis.read();
			String res="";
			while(value!=1) {
				res=res+(char)value;
				value=fis.read();	
			}
		}
		try (FileWriter fis=new FileWriter("D:\\io1.txt");){
			
		}
	}

}

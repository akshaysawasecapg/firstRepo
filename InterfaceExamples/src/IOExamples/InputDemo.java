package IOExamples;
import java.io.*;
public class InputDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			InputStream ins = System.in;
			byte[] ba = new byte[10];
			ins.read(ba);
			
			for(byte b : ba){
				System.out.print((char)b);
			}
			
		}catch(IOException e){
			System.out.println(e);
		}
	

	}

}

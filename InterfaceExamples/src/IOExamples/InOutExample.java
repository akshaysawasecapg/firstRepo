package IOExamples;
import java.io.*;
public class InOutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			InputStream in = System.in;
			byte[] ba = new byte[100];
			in.read(ba);
			
			PrintStream os = System.out;
			String str = "I'm Fine ! How are you today ?";
			os.write(str.getBytes());
			
		}catch(IOException e){
			System.out.println(e);
		}

	}

}

package IOExamples;
import java.io.*;
public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileReader fi = new FileReader("C://Users//ASAWASE//Downloads//newtext.txt");
			BufferedReader br = new BufferedReader(fi);
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}	
	}
}

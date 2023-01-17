package fileClassExample;
import java.io.*;
public class FileClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f1 = new File("C://Users//ASAWASE//Downloads//newFile.txt");
			System.out.println("File Name : "+f1.getName());
			System.out.println("Absolute Path : "+f1.getAbsolutePath());
			
			File f = new File("C://");
			File[] flist = f.listFiles();
			
			System.out.println("List of Files");
			for(File fileL : flist){
				System.out.println(fileL.getName());
			}
 			
			File f3 = new File("C://sampledir");
			if(f3.exists()){
				System.out.println("Directory already exists");
			}else{
				if(f3.mkdir()){
					System.out.println("Directory CREATED !");
				}else{
					System.out.println("Not Created");
				}
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

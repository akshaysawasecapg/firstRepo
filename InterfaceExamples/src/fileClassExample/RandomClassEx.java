package fileClassExample;

import java.io.RandomAccessFile;

public class RandomClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Apple", "Kiwi", "Mango"};
		try{
			RandomAccessFile rf = new RandomAccessFile("C://Users//ASAWASE//Downloads//newtext", "rw");
			for(String ele : arr){
				rf.writeUTF(ele);
			}
			rf.seek(2);
			String str = rf.readLine();
			System.out.println(str);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}

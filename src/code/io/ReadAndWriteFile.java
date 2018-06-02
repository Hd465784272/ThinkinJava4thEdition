package code.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


//


public class ReadAndWriteFile {
	public static void main(String[] args) {
		File file = new File("src/code/io/ReadMe");
		if(file.exists()){
			System.err.println("exist");
			try {
				
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr =  new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String line;
				while( (line=br.readLine()) != null){
					System.out.println(line);
				}
				br.close();
				isr.close();
				fis.close();
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else{
			System.err.println("not found!");
			try {
				file.createNewFile();
				System.out.println("create complate");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		try {
			File newfile = new File("src/code/io/ReadMe");
			FileOutputStream fos = new FileOutputStream(newfile);
			OutputStreamWriter osw = new  OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("静夜思\n");
			bw.write("李白\n");
			bw.write("窗前明月光\n");
			bw.write("疑是地上霜\n");
			bw.write("举头望明月\n");
			bw.write("低头思故乡\n");
			bw.close();
			osw.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

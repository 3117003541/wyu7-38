package homeworkday3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class mylife {
	public static void copyFile(String src,String dest) throws IOException{
		FileInputStream in=new FileInputStream(src);
		File f=new File(dest);
		if(!f.exists())
			f.createNewFile();
		FileOutputStream out=new FileOutputStream(f);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
			for(int i=0;i<c;i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}
		public static void main (String[] args)  throws IOException  {
			String fc="D:/KK/mylife.txt";
			String fd="C:/LL/mylife_cp.txt";
			File f1 = new File("D:/kk");
			File f2 = new File("C:/LL");
			File fs = new File(f1,"mylife.txt");
			fs.createNewFile();
			f1.mkdirs();
			f2.mkdirs();
			copyFile(fc,fd);//调用文件复制方法
			System.out.println("C:/LL/Copy文件夹文件复制成功");
		}	
	 
}


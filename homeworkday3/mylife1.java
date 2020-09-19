package homeworkday3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class mylife1 {
	public static void main(String[] args) throws IOException {
		String fileSrc="D:/YYY/mylife.txt";
		String fileDes="C:/JJJ/mylife_cp2.txt";
		File ff = new File("D:/YYY");
		File ft = new File("C:/JJJ");
		File fff = new File(ff,"mylife.txt");
		ff.mkdirs();
		ft.mkdirs();
		fff.createNewFile();
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(fileSrc);
			fo = new FileOutputStream(fileDes);
			in = fi.getChannel();//�õ���Ӧ���ļ�ͨ��
			out = fo.getChannel();//�õ���Ӧ���ļ�ͨ��
			in.transferTo(0, in.size(), out);//��������ͨ�����Ҵ�inͨ����ȡ��Ȼ��д��outͨ��
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("D:/YYY/mylife.txt�ļ����ļ����Ƴɹ�");
	}
}
		
package file3.book.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//예제 14-30
public class File3BookTest2 {

	public static void main(String[] args) {

		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);
		
		File[] files = dir.listFiles();
		
		for(int i =0; i< files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n"
			,df.format(new Date(f.lastModified())), attribute, size, name);
		}
	}
}

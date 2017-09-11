package aPackaje;

import java.io.File;

public class FilesPaths {
	static File f1;
	static File f2;
	static File f3;
	static{
		f1=new File("image1.png");
		f2=new File("image2.png");
		f3=new File("image3.png");
	}
	public static File getF3() {
		return f3;
	}
	
	public static File getF1() {
		return f1;
	}
	
	public static File getF2() {
		return f2;
	}
	
	
}

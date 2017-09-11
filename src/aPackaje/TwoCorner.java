package aPackaje;

import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TwoCorner {

	 List<String> LIST_TWO_CORNER ;
	static BufferedImage imagenL1;
	static BufferedImage imagenL2;
		 	
	public TwoCorner(BufferedImage imagenL1, BufferedImage imagenL2) {
		LIST_TWO_CORNER=new LinkedList<>();
		TwoCorner.imagenL1 = imagenL1;
		TwoCorner.imagenL2 = imagenL2;
	}
	public  List<String> getLISTTWOCORNER() {
		return LIST_TWO_CORNER;
	}
	public void setLIST() {
		int widthMin = imagenL1.getWidth();
		 int heightMin = imagenL1.getHeight();
		 int widthMax = 0;
		 int heightMax = 0;
		for (int y = 0; y < imagenL1.getHeight(); y++) {
			for (int x = 0; x < imagenL1.getWidth(); x++) {
				int scrPixL1 = imagenL1.getRGB(x, y);
				int scrPixL2 = imagenL2.getRGB(x, y);
				if (scrPixL1 == scrPixL2) {
					System.out.print("|");
				} else {
					imagenL1.setRGB(x, y, 3);
					System.out.print("p");
					{
						if (widthMin > x) {
							widthMin = x;
						}
						if (heightMin > y) {
							heightMin = y;
						}
						if (widthMax < x) {
							widthMax = x;
						}
						if (heightMax < y) {
							heightMax = y;
						}
					}
				}
			}
			System.out.println();
		}
		LIST_TWO_CORNER.add(Integer.toString(widthMin) + ":" + Integer.toString(heightMax));
		
		//the ather points be there
		
		LIST_TWO_CORNER.add(Integer.toString(widthMax) + ":" + Integer.toString(heightMin));
	}
	
	
	

}

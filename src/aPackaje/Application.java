package aPackaje;

import java.io.IOException;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		CreateBufferedImage c1 = new CreateBufferedImage("1");
		CreateBufferedImage c2 = new CreateBufferedImage("2");
		TwoCorner twoCorner = new TwoCorner(c1.getImage(), c2.getImage());
		twoCorner.setLIST();
		
		Copeing_DrawingTheNewImage copy = new Copeing_DrawingTheNewImage("1");
		List<Integer> list = copy.transformList(twoCorner.getLISTTWOCORNER());
		copy.drawRectangles(list);
	}

}

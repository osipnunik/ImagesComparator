package aPackaje;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.imageio.ImageIO;

public class Copeing_DrawingTheNewImage {
	BufferedImage image;

	public Copeing_DrawingTheNewImage(String number) throws IOException {
		CreateBufferedImage c = new CreateBufferedImage(number);
		this.image = c.getImage();
	}

	public void drawRectangles(List<Integer> arr) throws IOException {
		BufferedImage imageNew = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
		imageNew = ImageIO.read(FilesPaths.getF1());
		Graphics2D graphics = imageNew.createGraphics();
		graphics.setColor(Color.RED);
		graphics.setStroke(new BasicStroke(1));
		for (int i = 0; i < arr.size(); i += 4) {
			int x = arr.get(i);
			int y = arr.get(i +3);
			int RectWidth = arr.get(i + 2) - arr.get(i);
			int RectLenght = arr.get(i + 1) - arr.get(i + 3);
			System.out.println("x=" + x + " y=" + y + " RectWidth=" + RectWidth + " RectLenght=" + RectLenght);
			graphics.drawRect(x, y, RectWidth, RectLenght);
			graphics.dispose();
		}
		ImageIO.write(imageNew, "png", new File("imageNew.png"));
	}

	List<Integer> transformList(List<String> listOld) {
		List<Integer> listNew = new LinkedList<>();
		for (String element : listOld) {
			String[] arr = element.split(":");
			listNew.add(Integer.parseInt(arr[0]));
			listNew.add(Integer.parseInt(arr[1]));
		}
		return listNew;
	}

}

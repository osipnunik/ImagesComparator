package aPackaje;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class SellsComparison {
	static File f1, f2;
	static InputStream input1, input2;
	static ImageInputStream imageInput1;
	static BufferedImage imagenL1;
	public static void main(String[] args) throws IOException {
		f1 = new File("image1.png");
		input1 = new FileInputStream(f1);
		imageInput1 = ImageIO.createImageInputStream(input1);
		 imagenL1 = ImageIO.read(imageInput1);
		 f2=new File("image2.png");
		 input2 = new FileInputStream(f2);
		ImageInputStream imageInput2 = ImageIO.createImageInputStream(input2);
		BufferedImage imagenL2 = ImageIO.read(imageInput2);
		boolean vseSovpalo = true;
		boolean firstPointIsAchief = false;
		int widthMin = imagenL1.getWidth();
		int heightMin = imagenL1.getHeight();
		int widthMax = 0;
		int heightMax = 0;
		if (imagenL1.getHeight() == imagenL2.getHeight()) {
			System.out.println(imagenL1.getHeight() + " " + imagenL1.getWidth());
			for (int y = 0; y < imagenL1.getHeight(); y++) {
				for (int x = 0; x < imagenL1.getWidth(); x++) {
					int scrPixL1 = imagenL1.getRGB(x, y);
					int scrPixL2 = imagenL2.getRGB(x, y);
					if (scrPixL1 == scrPixL2) {
						System.out.print("|");
					} else {
						imagenL1.setRGB(x, y, 3);
						System.out.print("p");
						vseSovpalo = false;
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
			System.out.println("vseSovpalo: " + vseSovpalo);
			System.out.println("left lower corner: (" + widthMin + ", " + heightMin + ")");
			System.out.println("right upper corner: (" + widthMax + ", " + heightMax + ")");

			int width = imagenL1.getWidth();
			int height = imagenL1.getHeight();

			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

			image = ImageIO.read(f1);

			Graphics2D graphics = image.createGraphics();
			graphics.setColor(Color.RED);
			graphics.drawRect(widthMin, heightMin, widthMax - widthMin, heightMax - heightMin);
			graphics.setStroke(new BasicStroke(1));

			graphics.dispose();
			ImageIO.write(image, "png", new File("imageNew.png"));

		} else {
			System.out.println("dimensionsof images is not equal!!!");
		}

	}

	public static List<String> twoCorner(BufferedImage imagenL1, BufferedImage imagenL2) {
		int widthMin = imagenL1.getWidth();
		int heightMin = imagenL1.getHeight();
		int widthMax = 0;
		int heightMax = 0;
		List<String> list = new LinkedList<>();
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
		list.add(Integer.toString(widthMin) + ":" + Integer.toString(heightMax));
		list.add(Integer.toString(widthMax) + ":" + Integer.toString(heightMin));
		return list;
	}
}

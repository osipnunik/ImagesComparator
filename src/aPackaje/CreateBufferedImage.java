package aPackaje;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class CreateBufferedImage {
	BufferedImage image;
	
	public CreateBufferedImage(String number) throws IOException {
		if (number == "1") {
			FileInputStream inputStream = new FileInputStream(FilesPaths.getF1());
			ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
			BufferedImage im = ImageIO.read(imageInputStream);
			image = im;
		} else if (number == "2") {
			FileInputStream inputStream = new FileInputStream(FilesPaths.getF2());
			ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
			BufferedImage im = ImageIO.read(imageInputStream);
			image = im;
		} else if (number == "3") {
			FileInputStream inputStream = new FileInputStream(FilesPaths.getF2());
			ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
			BufferedImage im = ImageIO.read(imageInputStream);
			image = im;
		} else
			System.out.println("error: \"1\" or \"2\" or \"3\" required.");
	}

	public BufferedImage getImage() {
		return image;
	}
	
}

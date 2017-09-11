package aPackaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class XYWriter {

	public List<Rectangle>getMassivRectangle(Queue<String> linkList) {
		List <Rectangle>list = new ArrayList<>();
		Rectangle rectangle = new Rectangle();
		boolean semafor=true;
		for (String element : linkList) {
			if (semafor){
				String [] arr = element.split(":");
				rectangle.setWidthMin(Integer.parseInt(arr[0]));
				rectangle.setHeightMax(Integer.parseInt(arr[1]));
				
			}
			if (!semafor){
				String [] arr = element.split(":");
				rectangle.setWidthMax(Integer.parseInt(arr[0]));
				rectangle.setHeightMin(Integer.parseInt(arr[1]));
				list.add(rectangle);
			}semafor=!semafor;
		}
		return list;
	}

}

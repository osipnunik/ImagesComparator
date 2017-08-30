package pac;

public class DocumentFactory implements DocumentFactoryIF {

	@Override
	public DocumentIF createDocument(String type) {
		switch (type) {
		case "MyDocument":
			return new MyDocument();
		default:
			return null;
		}

	}

}

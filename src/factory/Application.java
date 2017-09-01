package pac;

public class Application {
	public static void main(String[] args) {
		DocumentFactoryIF documentFactory = new DocumentFactory();
		documentFactory.createDocument("pdf");
	}
}

package week4.day2;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("16.4 inches");
	}

	public static void main(String[] args) {
		Desktop size = new Desktop();
		size.desktopsize();
		size.computerModel();

	}

}

package homework;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'I';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Ünlüdür.");
			break;

		default:
			System.out.println("İnce Sesli Ünlüdür.");
		}

	}

}

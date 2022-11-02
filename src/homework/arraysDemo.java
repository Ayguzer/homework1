package homework;

import javax.sound.midi.SysexMessage;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "İsmail";
		String ogrenci2 = "İbrahim";
		String ogrenci3 = "Engin";
		String ogrenci4 = "Meriç";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("----------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "İsmail";
		ogrenciler[1] = "İbrahim";
		ogrenciler[2] = "Engin";
		ogrenciler[3] = "Meriç";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);}

			System.out.println("----------------------");
		
		for (String o : ogrenciler) {
				System.out.println(o);
			
		}
	}

}

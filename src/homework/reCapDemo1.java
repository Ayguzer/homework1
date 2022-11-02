package homework;

public class reCapDemo1 {

	public static void main(String[] args) {

		int sayi1 = 45;
		int sayi2 = 20;
		int sayi3 = 25;

		int enBuyukSayi = sayi1;
		String metin = "En büyük sayı";

		if (enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		if (enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}
		System.out.println(metin + " " + enBuyukSayi + " " + "olacaktır.");

		// kendi yorumlarımı katmaya çalıştım.
	}
}

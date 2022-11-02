package homework;

public class mukemmelSayı {

	public static void main(String[] args) {
		int sayı = 28;
		int total = 0;

		for (int i = 1; i < sayı; i++) {
			if (sayı % i == 0) {
				total = total + i;
			}
		}
		if (sayı == total) {
			System.out.println("Mükemmel Sayıdır.");
		} 
		else {
			System.out.println("Mükemmel Sayı Değildir.");
			
		}

	}

}

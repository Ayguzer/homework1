package homework;

import java.time.YearMonth;

public class reCapDemo2 {

	public static void main(String[] args) {

		double[] myList = { 1.7, 2.5, 10.2, 7.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			total = total + number;
			System.out.println(number);
			if (max < number) {
				max = number;
			}

		}
		System.out.println("Toplam Sayı" + " " + total);
		System.out.println("En Büyük Sayı" + " " + max);

	}

}

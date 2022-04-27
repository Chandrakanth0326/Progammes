package assignment;

import java.util.Iterator;

public class SumOf3No {

	public static void main(String[] args) {

		int s[] = { 22, 56, 87, 23 };
		// int temp=0;
		for (int j = 0; j < s.length; j++) {
			int rev = 0;
			int i = s[j];
			int copy = i;

			while (i != 0) {
				int dig = i % 10;
				rev = rev * 10 + dig;
				i = i / 10;
			}

			if (rev == i) {
				System.out.println("pal");
			} else {
				System.out.println("not pal");
			}
		}

	}
}